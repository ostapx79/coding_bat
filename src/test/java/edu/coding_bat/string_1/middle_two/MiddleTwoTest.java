package edu.coding_bat.string_1.middle_two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleTwoTest {
    MiddleTwo middleTwo = new MiddleTwo();

    @Test
    public void setMiddleTwo1Test() {
        assertEquals(middleTwo.middleTwo("string"), "ri");
    }

    @Test
    public void setMiddleTwo2Test() {
        assertEquals(middleTwo.middleTwo("code"), "od");
    }

    @Test
    public void setMiddleTwo3Test() {
        assertEquals(middleTwo.middleTwo("Practice"), "ct");
    }

    @Test
    public void setMiddleTwo4Test() {
        assertEquals(middleTwo.middleTwo("ab"), "ab");
    }

    @Test
    public void setMiddleTwo5Test() {
        assertEquals(middleTwo.middleTwo("0123456789"), "45");
    }
}