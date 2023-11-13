package edu.coding_bat.warmup_2.double_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleXTest {
    DoubleX doubleX = new DoubleX();

    @Test
    public void doubleX1Test() {
        assertTrue(doubleX.doubleX("axxbb"));
    }

    @Test
    public void doubleX2Test() {
        assertFalse(doubleX.doubleX("axaxax"));
    }

    @Test
    public void doubleX3Test() {
        assertTrue(doubleX.doubleX("xxxxx"));
    }

    @Test
    public void doubleX4Test() {
        assertFalse(doubleX.doubleX("xaxxx"));
    }

    @Test
    public void doubleX5Test() {
        assertFalse(doubleX.doubleX("aaaax"));
    }

    @Test
    public void doubleX6Test() {
        assertFalse(doubleX.doubleX(""));
    }

    @Test
    public void doubleX7Test() {
        assertFalse(doubleX.doubleX("abc"));
    }

    @Test
    public void doubleX8Test() {
        assertFalse(doubleX.doubleX("x"));
    }

    @Test
    public void doubleX9Test() {
        assertTrue(doubleX.doubleX("xx"));
    }

    @Test
    public void doubleX10Test() {
        assertFalse(doubleX.doubleX("xax"));
    }

    @Test
    public void doubleX11Test() {
        assertFalse(doubleX.doubleX("xaxx"));
    }
}