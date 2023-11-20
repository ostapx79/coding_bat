package edu.coding_bat.warmup_2.string_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringXTest {
    StringX stringX = new StringX();

    @Test
    public void stringX1Test() {
        assertEquals(stringX.stringX("xHxix"), "xHix");
        assertEquals(stringX.stringXT("xHxix"), "xHix");
    }

    @Test
    public void stringX2Test() {
        assertEquals(stringX.stringX("abxxxcd"), "abcd");
        assertEquals(stringX.stringXT("abxxxcd"), "abcd");
    }

    @Test
    public void stringX3Test() {
        assertEquals(stringX.stringX("xabxxxcdx"), "xabcdx");
        assertEquals(stringX.stringXT("xabxxxcdx"), "xabcdx");
    }

    @Test
    public void stringX4Test() {
        assertEquals(stringX.stringX("xKittenx"), "xKittenx");
        assertEquals(stringX.stringXT("xKittenx"), "xKittenx");
    }

    @Test
    public void stringX5Test() {
        assertEquals(stringX.stringX("Hello"), "Hello");
        assertEquals(stringX.stringXT("Hello"), "Hello");
    }

    @Test
    public void stringX6Test() {
        assertEquals(stringX.stringX("xx"), "xx");
        assertEquals(stringX.stringXT("xx"), "xx");
    }

    @Test
    public void stringX7Test() {
        assertEquals(stringX.stringX("x"), "x");
        assertEquals(stringX.stringXT("x"), "x");
    }

    @Test
    public void stringX8Test() {
        assertEquals(stringX.stringX(""), "");
        assertEquals(stringX.stringXT(""), "");
    }
}