package edu.coding_bat.warmup_2.array_667;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array667Test {
    Array667 array667 = new Array667();

    @Test
    public void array667_1Test() {
        assertEquals(array667.array667(new int[]{6, 6, 2}), 1);
        assertEquals(array667.array667T(new int[]{6, 6, 2}), 1);
    }

    @Test
    public void array667_2Test() {
        assertEquals(array667.array667(new int[]{6, 6, 2, 6}), 1);
        assertEquals(array667.array667T(new int[]{6, 6, 2, 6}), 1);
    }

    @Test
    public void array667_3Test() {
        assertEquals(array667.array667(new int[]{6, 7, 2, 6}), 1);
        assertEquals(array667.array667T(new int[]{6, 7, 2, 6}), 1);
    }

    @Test
    public void array667_4Test() {
        assertEquals(array667.array667(new int[]{6, 6, 2, 6, 7}), 2);
        assertEquals(array667.array667T(new int[]{6, 6, 2, 6, 7}), 2);
    }

    @Test
    public void array667_5Test() {
        assertEquals(array667.array667(new int[]{1, 6, 3}), 0);
        assertEquals(array667.array667T(new int[]{1, 6, 3}), 0);
    }

    @Test
    public void array667_6Test() {
        assertEquals(array667.array667(new int[]{6, 1}), 0);
        assertEquals(array667.array667T(new int[]{6, 1}), 0);
    }

    @Test
    public void array667_7Test() {
        assertEquals(array667.array667(new int[]{}), 0);
        assertEquals(array667.array667T(new int[]{}), 0);
    }

    @Test
    public void array667_8Test() {
        assertEquals(array667.array667(new int[]{3, 6, 7, 6}), 1);
        assertEquals(array667.array667T(new int[]{3, 6, 7, 6}), 1);
    }

    @Test
    public void array667_9Test() {
        assertEquals(array667.array667(new int[]{3, 6, 6, 7}), 2);
        assertEquals(array667.array667T(new int[]{3, 6, 6, 7}), 2);
    }

    @Test
    public void array667_10Test() {
        assertEquals(array667.array667(new int[]{6, 7, 6, 6}), 2);
        assertEquals(array667.array667T(new int[]{6, 7, 6, 6}), 2);
    }

    @Test
    public void array667_11Test() {
        assertEquals(array667.array667(new int[]{1, 2, 3, 4, 5, 6}), 0);
        assertEquals(array667.array667T(new int[]{1, 2, 3, 4, 5, 6}), 0);
    }

    @Test
    public void array667_12Test() {
        assertEquals(array667.array667(new int[]{1, 2, 3, 4, 6, 6}), 1);
        assertEquals(array667.array667T(new int[]{1, 2, 3, 4, 6, 6}), 1);
    }

}