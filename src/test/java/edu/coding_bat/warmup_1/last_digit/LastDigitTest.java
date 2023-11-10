package edu.coding_bat.warmup_1.last_digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastDigitTest {
    LastDigit lastD = new LastDigit();

    @Test
    public void lastDigit1Test() {
        assertTrue(lastD.lastDigit(7, 17));
    }

    @Test
    public void lastDigit2Test() {
        assertFalse(lastD.lastDigit(6, 17));
    }

    @Test
    public void lastDigit3Test() {
        assertTrue(lastD.lastDigit(3, 113));
    }

    @Test
    public void lastDigit4Test() {
        assertFalse(lastD.lastDigit(114, 113));
    }

    @Test
    public void lastDigit5Test() {
        assertTrue(lastD.lastDigit(114, 4));
    }

    @Test
    public void lastDigit6Test() {
        assertTrue(lastD.lastDigit(10, 0));
    }

    @Test
    public void lastDigit7Test() {
        assertFalse(lastD.lastDigit(11, 0));
    }
}