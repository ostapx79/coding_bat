package edu.coding_bat.warmup_1.in_3050;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In3050Test {
    In3050 in3050 = new In3050();

    @Test
    public void in3050_1Test() {
        assertTrue(in3050.in3050(30, 31));
    }

    @Test
    public void in3050_2Test() {
        assertFalse(in3050.in3050(30, 41));
    }

    @Test
    public void in3050_3Test() {
        assertTrue(in3050.in3050(40, 50));
    }

    @Test
    public void in3050_4Test() {
        assertFalse(in3050.in3050(40, 51));
    }

    @Test
    public void in3050_5Test() {
        assertFalse(in3050.in3050(30, 50));
    }

    @Test
    public void in3050_6Test() {
        assertFalse(in3050.in3050(50, 39));
    }

    @Test
    public void in3050_7Test() {
        assertTrue(in3050.in3050(40, 30));
    }

    @Test
    public void in3050_8Test() {
        assertTrue(in3050.in3050(49, 48));
    }

    @Test
    public void in3050_9Test() {
        assertTrue(in3050.in3050(50, 40));
    }

    @Test
    public void in3050_10Test() {
        assertFalse(in3050.in3050(50, 51));
    }

    @Test
    public void in3050_11Test() {
        assertTrue(in3050.in3050(35, 36));
    }

    @Test
    public void in3050_12Test() {
        assertFalse(in3050.in3050(35, 45));
    }

    @Test
    public void in3050_13Test() {
        assertTrue(in3050.in3050T(30, 31));
    }

    @Test
    public void in3050_14Test() {
        assertFalse(in3050.in3050T(30, 41));
    }

    @Test
    public void in3050_15Test() {
        assertTrue(in3050.in3050T(40, 50));
    }

    @Test
    public void in3050_16Test() {
        assertFalse(in3050.in3050T(40, 51));
    }

    @Test
    public void in3050_17Test() {
        assertFalse(in3050.in3050T(30, 50));
    }

    @Test
    public void in3050_18Test() {
        assertFalse(in3050.in3050T(50, 39));
    }

    @Test
    public void in3050_19Test() {
        assertTrue(in3050.in3050T(40, 30));
    }

    @Test
    public void in3050_20Test() {
        assertTrue(in3050.in3050T(49, 48));
    }

    @Test
    public void in3050_21Test() {
        assertTrue(in3050.in3050T(50, 40));
    }

    @Test
    public void in3050_22Test() {
        assertFalse(in3050.in3050T(50, 51));
    }

    @Test
    public void in3050_23Test() {
        assertTrue(in3050.in3050T(35, 36));
    }

    @Test
    public void in3050_24Test() {
        assertFalse(in3050.in3050T(35, 45));
    }

}