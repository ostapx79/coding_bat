package edu.coding_bat.warmup_1.in_1020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1020Test {
    In1020 in1020 = new In1020();

    @Test
    public void in1020_1Test() {
        assertTrue(in1020.in1020(12, 99));
    }

    @Test
    public void in1020_2Test() {
        assertTrue(in1020.in1020(21, 12));
    }

    @Test
    public void in1020_3Test() {
        assertFalse(in1020.in1020(8, 99));
    }

    @Test
    public void in1020_4Test() {
        assertTrue(in1020.in1020(10, 99));
    }

    @Test
    public void in1020_5Test() {
        assertTrue(in1020.in1020(20, 20));
    }

    @Test
    public void in1020_6Test() {
        assertFalse(in1020.in1020(21, 21));
    }

    @Test
    public void in1020_7Test() {
        assertFalse(in1020.in1020(9, 9));
    }

}