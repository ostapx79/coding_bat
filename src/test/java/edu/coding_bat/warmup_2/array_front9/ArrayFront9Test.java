package edu.coding_bat.warmup_2.array_front9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayFront9Test {
    /*
    Учитывая массив целых чисел, верните true,
    если один из первых 4 элементов массива равен 9.
    Длина массива может быть меньше 4.
     */
    ArrayFront9 arrayF9 = new ArrayFront9();

    @Test
    public void arrayFront9_1Test() {
        assertTrue(arrayF9.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        assertTrue(arrayF9.arrayFront9T(new int[]{1, 2, 9, 3, 4}));
    }

    @Test
    public void arrayFront9_2Test() {
        assertFalse(arrayF9.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        assertFalse(arrayF9.arrayFront9T(new int[]{1, 2, 3, 4, 9}));
    }

    @Test
    public void arrayFront9_3Test() {
        assertFalse(arrayF9.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        assertFalse(arrayF9.arrayFront9T(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void arrayFront9_4Test() {
        assertTrue(arrayF9.arrayFront9(new int[]{1, 2, 9}));
        assertTrue(arrayF9.arrayFront9T(new int[]{1, 2, 9}));
    }

    @Test
    public void arrayFront9_5Test() {
        assertFalse(arrayF9.arrayFront9(new int[]{1, 2}));
        assertFalse(arrayF9.arrayFront9T(new int[]{1, 2}));
    }

    @Test
    public void arrayFront9_6Test() {
        assertTrue(arrayF9.arrayFront9(new int[]{9}));
        assertTrue(arrayF9.arrayFront9T(new int[]{9}));
    }

    @Test
    public void arrayFront9_7Test() {
        int[] arrF2_7 = {};
        assertFalse(arrayF9.arrayFront9(arrF2_7));
        assertFalse(arrayF9.arrayFront9T(arrF2_7));
    }

    @Test
    public void arrayFront9_8Test() {
        assertTrue(arrayF9.arrayFront9(new int[]{9, 2, 3}));
        assertTrue(arrayF9.arrayFront9T(new int[]{9, 2, 3}));
    }

    @Test
    public void arrayFront9_9Test() {
        assertTrue(arrayF9.arrayFront9(new int[]{1, 9, 9}));
        assertTrue(arrayF9.arrayFront9T(new int[]{1, 9, 9}));
    }

    @Test
    public void arrayFront9_10Test() {
        assertFalse(arrayF9.arrayFront9(new int[]{1, 2, 3}));
        assertFalse(arrayF9.arrayFront9T(new int[]{1, 2, 3}));
    }

    @Test
    public void arrayFront9_11Test() {
        assertFalse(arrayF9.arrayFront9(new int[]{5, 5}));
        assertFalse(arrayF9.arrayFront9T(new int[]{5, 5}));
    }

    @Test
    public void arrayFront9_12Test() {
        assertFalse(arrayF9.arrayFront9(new int[]{2}));
        assertFalse(arrayF9.arrayFront9T(new int[]{2}));
    }

    @Test
    public void arrayFront9_13Test() {
        assertTrue(arrayF9.arrayFront9(new int[]{3, 9, 2, 3, 3}));
        assertTrue(arrayF9.arrayFront9T(new int[]{3, 9, 2, 3, 3}));
    }

}