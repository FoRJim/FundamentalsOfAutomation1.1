package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    @Test
    public void showBalanceForSmallAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 155;

        int actual = service.remain(amount);
        int expected = 845;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void showBalanceForLargeAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void showRemainderWhenGreaterThan1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void showBalanceWhenBuyingFor1000 () { //БАГ
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;  //Фактический результат: 1000, Ожидаемый: 0

        Assert.assertEquals(expected, actual);
    }

}