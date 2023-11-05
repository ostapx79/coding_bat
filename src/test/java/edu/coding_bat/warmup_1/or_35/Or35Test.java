package edu.coding_bat.warmup_1.or_35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Or35Test {
    Or35 or = new Or35();

    @Test
    public void or35_1Test() {
        assertTrue(or.or35(3));
    }

    @Test
    public void or35_2Test() {
        assertTrue(or.or35(10));
    }

    @Test
    public void or35_3Test() {
        assertFalse(or.or35(8));
    }

    @Test
    public void or35_4Test() {
        assertTrue(or.or35(15));
    }

    @Test
    public void or35_5Test() {
        assertTrue(or.or35(5));
    }

    @Test
    public void or35_6Test() {
        assertTrue(or.or35(9));
    }

    @Test
    public void or35_7Test() {
        assertFalse(or.or35(4));
    }

    @Test
    public void or35_8Test() {
        assertFalse(or.or35(7));
    }

    @Test
    public void or35_9Test() {
        assertTrue(or.or35(6));
    }

    @Test
    public void or35_10Test() {
        assertFalse(or.or35(17));
    }

    @Test
    public void or35_11Test() {
        assertTrue(or.or35(18));
    }

    @Test
    public void or35_12Test() {
        assertFalse(or.or35(29));
    }

    @Test
    public void or35_13Test() {
        assertTrue(or.or35(20));
    }

    @Test
    public void or35_14Test() {
        assertTrue(or.or35(21));
    }

    @Test
    public void or35_15Test() {
        assertFalse(or.or35(22));
    }

    @Test
    public void or35_16Test() {
        assertTrue(or.or35(45));
    }

    @Test
    public void or35_17Test() {
        assertTrue(or.or35(99));
    }

    @Test
    public void or35_18Test() {
        assertTrue(or.or35(100));
    }

    @Test
    public void or35_19Test() {
        assertFalse(or.or35(101));
    }

    @Test
    public void or35_20Test() {
        assertFalse(or.or35(121));
    }

    @Test
    public void or35_21Test() {
        assertFalse(or.or35(122));
    }

    @Test
    public void or35_22Test() {
        assertTrue(or.or35(123));
    }
}