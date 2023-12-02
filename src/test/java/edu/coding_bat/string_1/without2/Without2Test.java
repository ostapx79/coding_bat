package edu.coding_bat.string_1.without2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Without2Test {
    Without2 without2 = new Without2();

    @Test
    public void setWithout2_1Test() {
        assertEquals(without2.without2("HelloHe"), "lloHe");
    }

    @Test
    public void setWithout2_2Test() {
        assertEquals(without2.without2("HelloHi"), "HelloHi");
    }

    @Test
    public void setWithout2_3Test() {
        assertEquals(without2.without2("Hi"), "");
    }

    @Test
    public void setWithout2_4Test() {
        assertEquals(without2.without2("Chocolate"), "Chocolate");
    }

    @Test
    public void setWithout2_5Test() {
        assertEquals(without2.without2("xxx"), "x");
    }

    @Test
    public void setWithout2_6Test() {
        assertEquals(without2.without2("xx"), "");
    }

    @Test
    public void setWithout2_7Test() {
        assertEquals(without2.without2("x"), "x");
    }

    @Test
    public void setWithout2_8Test() {
        assertEquals(without2.without2(""), "");
    }

    @Test
    public void setWithout2_9Test() {
        assertEquals(without2.without2("Fruits"), "Fruits");
    }

}