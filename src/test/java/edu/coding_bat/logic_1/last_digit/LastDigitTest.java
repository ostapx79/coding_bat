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

}