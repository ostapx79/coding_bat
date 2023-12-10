package edu.coding_bat.string_1.without_x;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutXTest {
    WithoutX withoutX = new WithoutX();

    @Test
    public void setWithoutX1Test() {
        assertEquals(withoutX.withoutX("xHix"), "Hi");
    }

    @Test
    public void setWithoutX2Test() {
        assertEquals(withoutX.withoutX("xHi"), "Hi");
    }

    @Test
    public void setWithoutX3Test() {
        assertEquals(withoutX.withoutX("Hxix"), "Hxi");
    }

    @Test
    public void setWithoutX4Test() {
        assertEquals(withoutX.withoutX("Hi"), "Hi");
    }

    @Test
    public void setWithoutX5Test() {
        assertEquals(withoutX.withoutX("xxHi"), "xHi");
    }

    @Test
    public void setWithoutX6Test() {
        assertEquals(withoutX.withoutX("Hix"), "Hi");
    }

    @Test
    public void setWithoutX7Test() {
        assertEquals(withoutX.withoutX("xaxbx"), "axb");
    }

    @Test
    public void setWithoutX8Test() {
        assertEquals(withoutX.withoutX("xx"), "");
    }

    @Test
    public void setWithoutX9Test() {
        assertEquals(withoutX.withoutX("x"), "");
    }

    @Test
    public void setWithoutX10Test() {
        assertEquals(withoutX.withoutX(""), "");
    }

    @Test
    public void setWithoutX11Test() {
        assertEquals(withoutX.withoutX("Hello"), "Hello");
    }

    @Test
    public void setWithoutX12Test() {
        assertEquals(withoutX.withoutX("Hexllo"), "Hexllo");
    }
}