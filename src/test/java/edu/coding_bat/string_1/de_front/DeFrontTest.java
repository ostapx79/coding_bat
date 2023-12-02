package edu.coding_bat.string_1.de_front;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeFrontTest {
    DeFront deFront = new DeFront();

    @Test
    public void setDeFront1Test() {
        assertEquals(deFront.deFront("Hello"), "llo");
    }

    @Test
    public void setDeFront2Test() {
        assertEquals(deFront.deFront("java"), "va");
    }

    @Test
    public void setDeFront3Test() {
        assertEquals(deFront.deFront("away"), "aay");
    }

    @Test
    public void setDeFront4Test() {
        assertEquals(deFront.deFront("axy"), "ay");
    }

    @Test
    public void setDeFront5Test() {
        assertEquals(deFront.deFront("abc"), "abc");
    }

    @Test
    public void setDeFront6Test() {
        assertEquals(deFront.deFront("xby"), "by");
    }

    @Test
    public void setDeFront7Test() {
        assertEquals(deFront.deFront("ab"), "ab");
    }

    @Test
    public void setDeFront8Test() {
        assertEquals(deFront.deFront("ax"), "a");
    }

    @Test
    public void setDeFront9Test() {
        assertEquals(deFront.deFront("axb"), "ab");
    }

    @Test
    public void setDeFront10Test() {
        assertEquals(deFront.deFront("aaa"), "aa");
    }

    @Test
    public void setDeFront11Test() {
        assertEquals(deFront.deFront("xbc"), "bc");
    }

    @Test
    public void setDeFront12Test() {
        assertEquals(deFront.deFront("bbb"), "bb");
    }

    @Test
    public void setDeFront13Test() {
        assertEquals(deFront.deFront("bazz"), "zz");
    }

    @Test
    public void setDeFront14Test() {
        assertEquals(deFront.deFront("ba"), "");
    }

    @Test
    public void setDeFront15Test() {
        assertEquals(deFront.deFront("abxyz"), "abxyz");
    }

    @Test
    public void setDeFront16Test() {
        assertEquals(deFront.deFront("hi"), "");
    }

    @Test
    public void setDeFront17Test() {
        assertEquals(deFront.deFront("his"), "s");
    }

    @Test
    public void setDeFront18Test() {
        assertEquals(deFront.deFront("xz"), "");
    }

    @Test
    public void setDeFront19Test() {
        assertEquals(deFront.deFront("zzz"), "z");
    }
}