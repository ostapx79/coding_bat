package edu.coding_bat.logic_1.in1_to10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class In1To10Test {
    In1To10 in1To10 = new In1To10();

    @Test
    public void setIn1To10_1Test() {
        assertTrue(in1To10.in1To10(5, false));
    }

    @Test
    public void setIn1To10_2Test() {
        assertFalse(in1To10.in1To10(11, false));
    }

    @Test
    public void setIn1To10_3Test() {
        assertTrue(in1To10.in1To10(11, true));
    }

    @Test
    public void setIn1To10_4Test() {
        assertTrue(in1To10.in1To10(10, false));
    }

    @Test
    public void setIn1To10_5Test() {
        assertTrue(in1To10.in1To10(10, true));
    }

    @Test
    public void setIn1To10_6Test() {
        assertTrue(in1To10.in1To10(9, false));
    }

//    @Test
//    public void setIn1To10_7Test() {
//        assertFalse(in1To10.in1To10(9, true));
//    }

    @Test
    public void setIn1To10_7Test() {
        assertTrue(in1To10.in1To10(9, true));
    }


    @Test
    public void setIn1To10_8Test() {
        assertTrue(in1To10.in1To10(1, false));
    }

    @Test
    public void setIn1To10_9Test() {
        assertTrue(in1To10.in1To10(1, true));
    }

    @Test
    public void setIn1To10_10Test() {
        assertFalse(in1To10.in1To10(0, false));
    }

    @Test
    public void setIn1To10_11Test() {
        assertTrue(in1To10.in1To10(0, true));
    }

    @Test
    public void setIn1To10_12Test() {
        assertFalse(in1To10.in1To10(-1, false));
    }

    @Test
    public void setIn1To10_13Test() {
        assertTrue(in1To10.in1To10(-1, true));
    }

    @Test
    public void setIn1To10_14Test() {
        assertFalse(in1To10.in1To10(99, false));
    }

    @Test
    public void setIn1To10_15Test() {
        assertTrue(in1To10.in1To10(99, true));
    }
}