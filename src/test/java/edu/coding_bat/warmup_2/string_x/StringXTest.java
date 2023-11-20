package edu.coding_bat.warmup_2.string_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringXTest {
    StringX stringX = new StringX();

    @Test
    public void stringX1Test() {
        assertEquals(stringX.stringX("xHxix"), "xHix");
    }

    @Test
    public void stringX2Test() {
        assertEquals(stringX.stringX("abxxxcd"), "abcd");
    }

    @Test
    public void stringX3Test() {
        assertEquals(stringX.stringX("xabxxxcdx"), "xabcdx");
    }

}