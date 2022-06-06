package ru.netology.service;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldReturn999IfAmount1() {

        int actual = service.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn1IfAmount999() {

        int actual = service.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn100IfAmount900() {

        int actual = service.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn200IfAmount1800() {

        int actual = service.remain(1800);
        int expected = 200;

        org.junit.Assert.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void shouldReturn0IfAmount1000() {

        int actual = service.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }
}
