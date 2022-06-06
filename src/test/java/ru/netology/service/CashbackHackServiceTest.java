package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn0IfBoundary1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn100IfBoundary900() {

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn200IfBoundary1800() {

        int actual = service.remain(1800);
        int expected = 200;

        assertEquals(actual, expected);

    }
}