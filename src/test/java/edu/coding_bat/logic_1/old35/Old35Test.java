package edu.coding_bat.logic_1.old35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Old35Test {
    Old35 old35 = new Old35();

    @Test
    public void setOld35_1Test() {
        assertTrue(old35.old35(3));
    }

    @Test
    public void setOld35_2Test() {
        assertTrue(old35.old35(10));
    }

    @Test
    public void setOld35_3TEst() {
        assertFalse(old35.old35(15));
    }

    @Test
    public void setOld35_4Test() {
        assertTrue(old35.old35(5));
    }

    @Test
    public void setOld35_5Test() {
        assertTrue(old35.old35(9));
    }

    @Test
    public void setOld35_6Test() {
        assertFalse(old35.old35(8));
    }

    @Test
    public void setOld35_7Test() {
        assertFalse(old35.old35(7));
    }

    @Test
    public void setOld35_8Test() {
        assertTrue(old35.old35(6));
    }

    @Test
    public void setOld35_9Test() {
        assertFalse(old35.old35(17));
    }

    @Test
    public void setOld35_10Test() {
        assertTrue(old35.old35(18));
    }

    @Test
    public void setOld35_11Test() {
        assertFalse(old35.old35(29));
    }

    @Test
    public void setOld35_12Test() {
        assertTrue(old35.old35(20));
    }

    @Test
    public void setOld35_13Test() {
        assertTrue(old35.old35(21));
    }

    @Test
    public void setOld35_14Test() {
        assertFalse(old35.old35(22));
    }

    @Test
    public void setOld35_15Test() {
        assertFalse(old35.old35(45));
    }

    @Test
    public void setOld35_16Test() {
        assertTrue(old35.old35(99));
    }
}