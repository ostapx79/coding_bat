package edu.coding_bat.logic_1.two_as_one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoAsOneTest {
    TwoAsOne twoAsOne = new TwoAsOne();

    @Test
    public void setTwoAsOne1Test() {
        assertTrue(twoAsOne.twoAsOne(1, 2, 3));
    }

    @Test
    public void setTwoAsOne2Test() {
        assertTrue(twoAsOne.twoAsOne(3, 1, 2));
    }

    @Test
    public void setTwoAsOne3Test() {
        assertFalse(twoAsOne.twoAsOne(3, 2, 2));
    }

    @Test
    public void setTwoAsOne4Test() {
        assertTrue(twoAsOne.twoAsOne(2, 3, 1));
    }

    @Test
    public void setTwoAsOne5Test() {
        assertTrue(twoAsOne.twoAsOne(5, 3, -2));
    }

    @Test
    public void setTwoAsOne6Test() {
        assertFalse(twoAsOne.twoAsOne(5, 3, -3));
    }

    @Test
    public void setTwoAsOne7Test() {
        assertTrue(twoAsOne.twoAsOne(2, 5, 3));
    }

    @Test
    public void setTwoAsOne8Test() {
        assertFalse(twoAsOne.twoAsOne(9, 5, 5));
    }

    @Test
    public void setTwoAsOne9Test() {
        assertTrue(twoAsOne.twoAsOne(9, 4, 5));
    }

    @Test
    public void setTwoAsOne10Test() {
        assertTrue(twoAsOne.twoAsOne(5, 4, 9));
    }

    @Test
    public void setTwoAsOne11Test() {
        assertTrue(twoAsOne.twoAsOne(3, 3, 0));
    }

    @Test
    public void setTwoAsOne12Test() {
        assertFalse(twoAsOne.twoAsOne(3, 3, 2));
    }

}