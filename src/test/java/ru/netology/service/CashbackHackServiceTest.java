package ru.netology.service;

import org.testng.annotations.Ignore;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldReturn999IfAmount1() {

        int actual = service.remain(1);
        int expected = 999;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn1IfAmount999() {

        int actual = service.remain(999);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn100IfAmount900() {

        int actual = service.remain(900);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn200IfAmount1800() {

        int actual = service.remain(1800);
        int expected = 200;

        org.testng.Assert.assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldReturn0IfAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);

    }
}