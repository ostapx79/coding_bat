package edu.coding_bat.warmup_1.int_max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntMaxTest {
    IntMax intM = new IntMax();

    @Test
    public void intMax1Test() {
        assertEquals(intM.intMax(1, 2, 3), 3);
    }

    @Test
    public void intMax2Test() {
        assertEquals(intM.intMax(1, 3, 2), 3);
    }

    @Test
    public void intMax3Test() {
        assertEquals(intM.intMax(3, 2, 1), 3);
    }

    @Test
    public void intMax4Test() {
        assertEquals(intM.intMax(9, 3, 3), 9);
    }

    @Test
    public void intMax5Test() {
        assertEquals(intM.intMax(3, 9, 3), 9);
    }

    @Test
    public void intMax6Test() {
        assertEquals(intM.intMax(3, 3, 9), 9);
    }

    @Test
    public void intMax7Test() {
        assertEquals(intM.intMax(8, 2, 3), 8);
    }

    @Test
    public void intMax8Test() {
        assertEquals(intM.intMax(-3, -2, -1), -1);
    }

    @Test
    public void intMax9Test() {
        assertEquals(intM.intMax(6, 2, 5), 6);
    }

    @Test
    public void intMax10Test() {
        assertEquals(intM.intMax(5, 6, 2), 6);
    }

    @Test
    public void intMax11Test() {
        assertEquals(intM.intMax(5, 2, 6), 6);
    }

    @Test
    public void intMax12Test() {
        assertEquals(intM.intMax1(1, 2, 3), 3);
    }

    @Test
    public void intMax13Test() {
        assertEquals(intM.intMax1(1, 3, 2), 3);
    }

    @Test
    public void intMax14Test() {
        assertEquals(intM.intMax1(3, 2, 1), 3);
    }

    @Test
    public void intMax15Test() {
        assertEquals(intM.intMax1(9, 3, 3), 9);
    }

    @Test
    public void intMax16Test() {
        assertEquals(intM.intMax1(3, 9, 3), 9);
    }

    @Test
    public void intMax17Test() {
        assertEquals(intM.intMax1(3, 3, 9), 9);
    }

    @Test
    public void intMax18Test() {
        assertEquals(intM.intMax1(8, 2, 3), 8);
    }

    @Test
    public void intMax19Test() {
        assertEquals(intM.intMax1(-3, -2, -1), -1);
    }

    @Test
    public void intMax20Test() {
        assertEquals(intM.intMax1(6, 2, 5), 6);
    }

    @Test
    public void intMax21Test() {
        assertEquals(intM.intMax1(5, 6, 2), 6);
    }

    @Test
    public void intMax22Test() {
        assertEquals(intM.intMax1(5, 2, 6), 6);
    }
}