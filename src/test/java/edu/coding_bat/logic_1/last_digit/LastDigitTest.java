package edu.coding_bat.logic_1.last_digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {
    LastDigit lastDigit = new LastDigit();

    @Test
    public void setLastDigit1Test() {
        assertTrue(lastDigit.lastDigit(23, 19, 13));
    }

    @Test
    public void setLastDigit2Test() {
        assertFalse(lastDigit.lastDigit(23, 19, 12));
    }

    @Test
    public void setLastDigit3Test() {
        assertTrue(lastDigit.lastDigit(23, 19, 3));
    }

    @Test
    public void setLastDigit4Test() {
        assertTrue(lastDigit.lastDigit(23, 19, 39));
    }

    @Test
    public void setLastDigit5Test() {
        assertFalse(lastDigit.lastDigit(1, 2, 3));
    }

    @Test
    public void setLastDigit6Test() {
        assertTrue(lastDigit.lastDigit(1, 1, 2));
    }

    @Test
    public void setLastDigit7Test() {
        assertTrue(lastDigit.lastDigit(1, 2, 2));
    }

    @Test
    public void setLastDigit8Test() {
        assertFalse(lastDigit.lastDigit(14, 25, 43));
    }

    @Test
    public void setLastDigit9Test() {
        assertTrue(lastDigit.lastDigit(14, 25, 45));
    }

    @Test
    public void setLastDigit10Test() {
        assertFalse(lastDigit.lastDigit(248, 106, 1002));
    }

    @Test
    public void setLastDigit11Test() {
        assertTrue(lastDigit.lastDigit(248, 106, 1008));
    }

    @Test
    public void setLastDigit12Test() {
        assertTrue(lastDigit.lastDigit(10, 11, 20));
    }

    @Test
    public void setLastDigit13Test() {
        assertTrue(lastDigit.lastDigit(0, 11, 0));
    }
}