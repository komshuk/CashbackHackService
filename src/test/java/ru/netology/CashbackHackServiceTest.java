package ru.netology;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testOne() {
        org.junit.Assert.assertEquals(10, service.remain(990));
    }

    @org.junit.Test
    public void testTwo() {
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void testThree() {
        org.junit.Assert.assertEquals(1001, service.remain(-1));
    }

    @org.junit.Test
    public void testFour() {
        org.junit.Assert.assertEquals(50, service.remain(950));
    }

    @org.junit.Test
    public void testFive() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void testSix() {
        org.junit.Assert.assertEquals(800, service.remain(1200));
    }

    @org.junit.Test
    public void testSeven() {
        org.junit.Assert.assertEquals(500, service.remain(500));
    }

}