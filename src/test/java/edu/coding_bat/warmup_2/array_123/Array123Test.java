package edu.coding_bat.warmup_2.array_123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array123Test {
    Array123 array123 = new Array123();

    @Test
    public void array123_1Test() {
        assertTrue(array123.array123(new int[]{1, 1, 2, 3, 1}));
        assertTrue(array123.array123T(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    public void array123_2Test() {
        assertFalse(array123.array123(new int[]{1, 1, 2, 4, 1}));
        assertFalse(array123.array123T(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    public void array123_3Test() {
        assertTrue(array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertTrue(array123.array123T(new int[]{1, 1, 2, 1, 2, 3}));
    }

    @Test
    public void array123_4Test() {
        assertFalse(array123.array123(new int[]{1, 1, 2, 1, 2, 1}));
        assertFalse(array123.array123T(new int[]{1, 1, 2, 1, 2, 1}));
    }

    @Test
    public void array123_5Test() {
        assertTrue(array123.array123(new int[]{1, 2, 3, 1, 2, 3}));
        assertTrue(array123.array123T(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    public void array123_6Test() {
        assertTrue(array123.array123(new int[]{1, 2, 3}));
        assertTrue(array123.array123T(new int[]{1, 2, 3}));
    }

    @Test
    public void array123_7Test() {
        assertFalse(array123.array123(new int[]{1, 1, 1}));
        assertFalse(array123.array123T(new int[]{1, 1, 1}));
    }

    @Test
    public void array123_8Test() {
        assertFalse(array123.array123(new int[]{1, 2}));
        assertFalse(array123.array123T(new int[]{1, 2}));
    }

    @Test
    public void array123_9Test() {
        assertFalse(array123.array123(new int[]{1}));
        assertFalse(array123.array123T(new int[]{1}));
    }

    @Test
    public void array123_10Test() {
        assertFalse(array123.array123(new int[]{}));
        assertFalse(array123.array123T(new int[]{}));
    }

}