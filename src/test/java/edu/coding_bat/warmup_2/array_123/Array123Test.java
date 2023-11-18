package edu.coding_bat.warmup_2.array_123;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array123Test {
    Array123 array123 = new Array123();

    @Test
    public void array123_1Test() {
        assertTrue(array123.array123(new int[]{1, 1, 2, 3, 1}));
    }

    @Test
    public void array123_2Test() {
        assertFalse(array123.array123(new int[]{1, 1, 2, 4, 1}));
    }

    @Test
    public void array123_3Test() {
        assertTrue(array123.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }
}