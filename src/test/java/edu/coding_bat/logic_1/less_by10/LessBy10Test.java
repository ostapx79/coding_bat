package edu.coding_bat.logic_1.less_by10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LessBy10Test {
    LessBy10 lessBy10 = new LessBy10();

    @Test
    public void setLessBy10_1Test() {
        assertTrue(lessBy10.lessBy10(1, 7, 11));
    }

    @Test
    public void setLessBy10_2Test() {
        assertFalse(lessBy10.lessBy10(1, 7, 10));
    }

    @Test
    public void setLessBy10_3Test() {
        assertTrue(lessBy10.lessBy10(11, 1, 7));
    }

    @Test
    public void setLessBy10_4Test() {
        assertFalse(lessBy10.lessBy10(10, 7, 1));
    }

    @Test
    public void setLessBy10_5Test() {
        assertTrue(lessBy10.lessBy10(-10, 2, 2));
    }

    @Test
    public void setLessBy10_6Test() {
        assertFalse(lessBy10.lessBy10(2, 11, 11));
    }

    @Test
    public void setLessBy10_7Test() {
        assertTrue(lessBy10.lessBy10(3, 3, 30));
    }

    @Test
    public void setLessBy10_8Test() {
        assertFalse(lessBy10.lessBy10(3, 3, 3));
    }

    @Test
    public void setLessBy10_9Test() {
        assertTrue(lessBy10.lessBy10(10, 1, 11));
    }

    @Test
    public void setLessBy10_10Test() {
        assertTrue(lessBy10.lessBy10(10, 11, 1));
    }

    @Test
    public void setLessBy10_11Test() {
        assertFalse(lessBy10.lessBy10(10, 11, 2));
    }

    @Test
    public void setLessBy10_12Test() {
        assertTrue(lessBy10.lessBy10(3, 30, 3));
    }

    @Test
    public void setLessBy10_13Test() {
        assertTrue(lessBy10.lessBy10(2, 2, -8));
    }

    @Test
    public void setLessBy10_14Test() {
        assertTrue(lessBy10.lessBy10(2, 8, 12));
    }

}