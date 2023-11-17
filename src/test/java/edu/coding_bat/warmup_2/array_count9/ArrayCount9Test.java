package edu.coding_bat.warmup_2.array_count9;

import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCount9Test {
    ArrayCount9 arrayC9 = new ArrayCount9();

    @Test
    public void arrayCount9_1Test() {
        assertEquals(arrayC9.arrayCount9(new int[]{1, 2, 9}), 1);
    }

    @Test
    public void arrayCount9_2Test() {
        assertEquals(arrayC9.arrayCount9(new int[] {1, 9, 9}), 2);
    }

    @Test
    public void arrayCount9_3Test() {
        assertEquals(arrayC9.arrayCount9(new int[]{1, 9, 9, 3, 9}), 3);
    }

    @Test
    public void arrayCount9_4Test() {
        assertEquals(arrayC9.arrayCount9(new int[]{1, 2, 3}), 0);
    }

    @Test
    public void arrayCount9_5Test() {
        assertEquals(arrayC9.arrayCount9(new int[]{}), 0);
    }

    @Test
    public void arrayCount9_6Test() {
        assertEquals(arrayC9.arrayCount9(new int[]{4, 3, 4, 3, 1}), 0);
    }

    @Test
    public void arrayCount9_7Test() {
        assertEquals(arrayC9.arrayCount9(new int[]{9, 2, 4, 3, 1}), 1);
    }
}