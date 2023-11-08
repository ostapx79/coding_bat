package edu.coding_bat.warmup_1.close_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Close10Test {
    Close10 close10 = new Close10();

    @Test
    public void close10_1Test() {
        assertEquals(close10.close10(8, 13), 8);
    }

    @Test
    public void close10_2Test() {
        assertEquals(close10.close10(13, 8), 8);
    }

    @Test
    public void close10_3Test() {
        assertEquals(close10.close10(13, 7), 0);
    }

    @Test
    public void close10_4Test() {
        assertEquals(close10.close10(7, 13), 0);
    }

    @Test
    public void close10_5Test() {
        assertEquals(close10.close10(9, 13), 9);
    }

    @Test
    public void close10_6Test() {
        assertEquals(close10.close10(10, 12), 10);
    }

    @Test
    public void close10_7Test() {
        assertEquals(close10.close10(11, 10), 10);
    }

    @Test
    public void close10_8Test() {
        assertEquals(close10.close10(5, 21), 5);
    }

    @Test
    public void close10_9Test() {
        assertEquals(close10.close10(0, 20), 0);
    }

    @Test
    public void close10_10Test() {
        assertEquals(close10.close10(10, 10), 0);
    }

    @Test
    public void close10_11Test() {
        assertEquals(close10.close10T(8, 13), 8);
    }

    @Test
    public void close10_12Test() {
        assertEquals(close10.close10T(13, 8), 8);
    }

    @Test
    public void close10_13Test() {
        assertEquals(close10.close10T(13, 7), 0);
    }

    @Test
    public void close10_14Test() {
        assertEquals(close10.close10T(7, 13), 0);
    }

    @Test
    public void close10_15Test() {
        assertEquals(close10.close10T(9, 13), 9);
    }

    @Test
    public void close10_16Test() {
        assertEquals(close10.close10T(10, 12), 10);
    }

    @Test
    public void close10_17Test() {
        assertEquals(close10.close10T(11, 10), 10);
    }

    @Test
    public void close10_18Test() {
        assertEquals(close10.close10T(5, 21), 5);
    }

    @Test
    public void close10_19Test() {
        assertEquals(close10.close10T(0, 20), 0);
    }

    @Test
    public void close10_20Test() {
        assertEquals(close10.close10T(10, 10), 0);
    }
}