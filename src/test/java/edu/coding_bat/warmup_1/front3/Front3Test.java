package edu.coding_bat.warmup_1.front3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front3Test {
    Front3 fro3 = new Front3();

    @Test
    public void front3_1Test() {
        assertEquals(fro3.front3("java"), "javjavjav");
    }

    @Test
    public void front3_2Test() {
        assertEquals(fro3.front3("Chocolate"), "ChoChoCho");
    }

    @Test
    public void front3_3Test() {
        assertEquals(fro3.front3("abc"), "abcabcabc");
    }

    @Test
    public void front3_4Test() {
        assertEquals(fro3.front3("abcXYZ"), "abcabcabc");
    }

    @Test
    public void front3_5Test() {
        assertEquals(fro3.front3("ab"), "ababab");
    }

    @Test
    public void front3_6Test() {
        assertEquals(fro3.front3("a"), "aaa");
    }

    @Test
    public void front3_7Test() {
        assertEquals(fro3.front3(""), "");
    }

    @Test
    public void front3_8Test() {
        assertEquals(fro3.front3E(""), "");
    }

    @Test
    public void front3_9Test() {
        assertEquals(fro3.front3E("ab"), "ababab");
    }

    @Test
    public void front3_10Test() {
        assertEquals(fro3.front3E("java"), "javjavjav");
    }
}