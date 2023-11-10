package edu.coding_bat.warmup_1.max_1020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Max1020Test {
    Max1020 max1020 = new Max1020();

    @Test
    public void max1020_1Test() {
        assertEquals(max1020.max1020(11, 19), 19);
    }

    @Test
    public void max1020_2Test() {
        assertEquals(max1020.max1020(19, 11), 19);
    }

    @Test
    public void max1020_3Test() {
        assertEquals(max1020.max1020(11, 9), 11);
    }

    @Test
    public void max1020_4Test() {
        assertEquals(max1020.max1020(9, 21), 0);
    }

    @Test
    public void max1020_5Test() {
        assertEquals(max1020.max1020(10, 21), 10);
    }

    @Test
    public void max1020_6Test() {
        assertEquals(max1020.max1020(21, 10), 10);
    }

    @Test
    public void max1020_7Test() {
        assertEquals(max1020.max1020(9, 11), 11);
    }

    @Test
    public void max1020_8Test() {
        assertEquals(max1020.max1020(23, 10), 10);
    }

    @Test
    public void max1020_9Test() {
        assertEquals(max1020.max1020(20, 10), 20);
    }

    @Test
    public void max1020_10Test() {
        assertEquals(max1020.max1020(7, 20), 20);
    }

    @Test
    public void max1020_11Test() {
        assertEquals(max1020.max1020(17, 16), 17);
    }

    @Test
    public void max1020_12Test() {
        assertEquals(max1020.max1020T(11, 19), 19);
    }

    @Test
    public void max1020_13Test() {
        assertEquals(max1020.max1020T(19, 11), 19);
    }

    @Test
    public void max1020_14Test() {
        assertEquals(max1020.max1020T(11, 9), 11);
    }

    @Test
    public void max1020_15Test() {
        assertEquals(max1020.max1020T(9, 21), 0);
    }

    @Test
    public void max1020_16Test() {
        assertEquals(max1020.max1020T(10, 21), 10);
    }

    @Test
    public void max1020_17Test() {
        assertEquals(max1020.max1020T(21, 10), 10);
    }

    @Test
    public void max1020_18Test() {
        assertEquals(max1020.max1020T(9, 11), 11);
    }

    @Test
    public void max1020_19Test() {
        assertEquals(max1020.max1020T(23, 10), 10);
    }

    @Test
    public void max1020_20Test() {
        assertEquals(max1020.max1020T(20, 10), 20);
    }

    @Test
    public void max1020_21Test() {
        assertEquals(max1020.max1020T(7, 20), 20);
    }

    @Test
    public void max1020_22Test() {
        assertEquals(max1020.max1020T(17, 16), 17);
    }

}