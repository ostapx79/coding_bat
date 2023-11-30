package edu.coding_bat.string_1.last_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastTwoTest {
    LastTwo lastTwo = new LastTwo();

    @Test
    public void setLastTwo1Test() {
        assertEquals(lastTwo.lastTwo("coding"), "codign");
    }

    @Test
    public void setLastTwo2Test() {
        assertEquals(lastTwo.lastTwo("cat"), "cta");
    }

    @Test
    public void setLastTwo3Test() {
        assertEquals(lastTwo.lastTwo("ab"), "ba");
    }

    @Test
    public void setLastTwo4Test() {
        assertEquals(lastTwo.lastTwo("a"), "a");
    }

    @Test
    public void setLastTwo5Test() {
        assertEquals(lastTwo.lastTwo(""), "");
    }

}