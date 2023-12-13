package edu.coding_bat.logic_1.love6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Love6Test {
    Love6 love6 = new Love6();

    @Test
    public void setLove6_1Test() {
        assertTrue(love6.love6(6, 4));
    }

    @Test
    public void setLove6_2Test() {
        assertFalse(love6.love6(4, 5));
    }

    @Test
    public void setLove6_3Test() {
        assertTrue(love6.love6(1, 5));
    }

    @Test
    public void setLove6_4Test() {
        assertTrue(love6.love6(1, 6));
    }

    @Test
    public void setLove6_5Test() {
        assertFalse(love6.love6(1, 8));
    }

    @Test
    public void setLove6_6Test() {
        assertTrue(love6.love6(1, 7));
    }

    @Test
    public void setLove6_7Test() {
        assertFalse(love6.love6(7, 5));
    }

    @Test
    public void setLove6_8Test() {
        assertTrue(love6.love6(8, 2));
    }

    @Test
    public void setLove6_9Test() {
        assertTrue(love6.love6(6, 6));
    }

    @Test
    public void setLove6_10Test() {
        assertFalse(love6.love6(-6, 2));
    }

    @Test
    public void setLove6_11Test() {
        assertTrue(love6.love6(-4, -10));
    }

    @Test
    public void setLove6_12Test() {
        assertFalse(love6.love6(-7, 1));
    }

    @Test
    public void setLove6_13Test() {
        assertTrue(love6.love6(7, -1));
    }

    @Test
    public void setLove6_14Test() {
        assertTrue(love6.love6(-6, 12));
    }

    @Test
    public void setLove6_15Test() {
        assertFalse(love6.love6(-2, -4));
    }

    @Test
    public void setLove6_16Test() {
        assertTrue(love6.love6(7, 1));
    }

    @Test
    public void setLove6_17Test() {
        assertFalse(love6.love6(0, 9));
    }

    @Test
    public void setLove6_18Test() {
        assertFalse(love6.love6(8, 3));
    }

    @Test
    public void setLove6_19Test() {
        assertTrue(love6.love6(3, 3));
    }

    @Test
    public void setLove6_20Test() {
        assertFalse(love6.love6(3, 4));
    }

    @Test
    public void setLove6_21Test() {
        assertFalse(love6.love6(-3, -3));
    }
}