package edu.coding_bat.warmup_2.string_bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringBitsTest {
    StringBits stringB = new StringBits();

    @Test
    public void stringBits() {
        assertEquals(stringB.stringBits("Hello"), "Hlo");
    }

    @Test
    public void stringBits2Test() {
        assertEquals(stringB.stringBits("Hi"), "H");
    }

    @Test
    public void stringBits3Test() {
        assertEquals(stringB.stringBits("Heeololeo"), "Hello");
    }

    @Test
    public void stringBits4Test() {
        assertEquals(stringB.stringBits("HiHiHi"), "HHH");
    }

    @Test
    public void stringBits5Test() {
        assertEquals(stringB.stringBits(""), "");
    }

    @Test
    public void stringBits6Test() {
        assertEquals(stringB.stringBits("Greetings"), "Getns");
    }

    @Test
    public void stringBits7Test() {
        assertEquals(stringB.stringBits("Chocolate"), "Cooae");
    }

    @Test
    public void stringBits8Test() {
        assertEquals(stringB.stringBits("pi"), "p");
    }

    @Test
    public void stringBits9Test() {
        assertEquals(stringB.stringBits("Hello Kitten"), "HloKte");
    }

    @Test
    public void stringBits10Test() {
        assertEquals(stringB.stringBits("hxaxpxpxy"), "happy");
    }
}