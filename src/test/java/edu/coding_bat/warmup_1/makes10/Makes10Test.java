package edu.coding_bat.warmup_1.makes10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Makes10Test {
    // Учитывая два целых числа, a и b, верните true,
    // если одно, если они равны 10 или если их сумма равна 10.

    // makes10(9, 10) → true
    // makes10(9, 9) → false
    // makes10(1, 9) → true

    Makes10 makes10 = new Makes10();
    @Test
    public void makes10_1() {
        assertTrue(makes10.makes10(9, 10));
    }

    @Test
    public void makes10_2() {
        assertFalse(makes10.makes10(9, 9));
    }

    @Test
    public void makes10_3() {
        assertTrue(makes10.makes10(1, 9));
    }

    @Test
    public void makes10_4() {
        assertTrue(makes10.makes10(10, 1));
    }

    @Test
    public void makes10_5() {
        assertTrue(makes10.makes10(10, 10));
    }

    @Test
    public void makes10_6() {
        assertTrue(makes10.makes10(8, 2));
    }

    @Test
    public void makes10_7() {
        assertFalse(makes10.makes10(8, 3));
    }

    @Test
    public void makes10_8() {
        assertTrue(makes10.makes10(10, 42));
    }

    @Test
    public void makes10_9() {
        assertTrue(makes10.makes10(12, -2));
    }

}