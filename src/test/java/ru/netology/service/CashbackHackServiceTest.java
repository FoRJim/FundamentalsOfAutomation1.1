package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void showBalanceForSmallAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 155;

        int actual = service.remain(amount);
        int expected = 845;

        assertEquals(actual, expected);
    }

    @Test
    public void showBalanceForLargeAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void showRemainderWhenGreaterThan1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void showBalanceWhenBuyingFor1000() { //БАГ
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}