package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void testOne() {
        org.testng.Assert.assertEquals(service.remain(10), 990);
    }

    @org.testng.annotations.Test
    public void testTwo() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void testThree() {
        org.testng.Assert.assertEquals(service.remain(1), 999);
    }

    @org.testng.annotations.Test
    public void testFour() {
        org.testng.Assert.assertEquals(service.remain(950), 50);
    }

    @org.testng.annotations.Test
    public void testFive() {
        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void testSix() {
        org.testng.Assert.assertEquals(service.remain(1100), 900);
    }

    @org.testng.annotations.Test
    public void testSeven() {
        org.testng.Assert.assertEquals(service.remain(500), 500);
    }
}