package edu.coding_bat.string_1.without_x2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutX2Test {
    WithoutX2 withoutX2 = new WithoutX2();

    @Test
    public void setWithoutX2_1Test() {
        assertEquals(withoutX2.withoutX2("xHi"), "Hi");
    }

    @Test
    public void setWithoutX2_2Test() {
        assertEquals(withoutX2.withoutX2("Hxi"), "Hi");
    }

    @Test
    public void setWithoutX2_3Test() {
        assertEquals(withoutX2.withoutX2("Hi"), "Hi");
    }

    @Test
    public void setWithoutX2_4Test() {
        assertEquals(withoutX2.withoutX2("xxHi"), "Hi");
    }

    @Test
    public void setWithoutX2_5Test() {
        assertEquals(withoutX2.withoutX2("xaxb"), "axb");
    }

    @Test
    public void setWithoutX2_6Test() {
        assertEquals(withoutX2.withoutX2("xx"), "");
    }

    @Test
    public void setWithoutX2_7Test() {
        assertEquals(withoutX2.withoutX2("x"), "");
    }

    @Test
    public void setWithoutX2_8Test() {
        assertEquals(withoutX2.withoutX2(""), "");
    }

    @Test
    public void setWithoutX2_9Test() {
        assertEquals(withoutX2.withoutX2("Hello"), "Hello");
    }

    @Test
    public void setWithoutX2_10Test() {
        assertEquals(withoutX2.withoutX2("Hexllo"), "Hexllo");
    }

    @Test
    public void setWithoutX2_11Test() {
        assertEquals(withoutX2.withoutX2("xHxllo"), "Hxllo");
    }
}