package ru.netology.service;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        AssertJUnit.assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testRemainWithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        AssertJUnit.assertEquals(actual, expected);
    }

}
