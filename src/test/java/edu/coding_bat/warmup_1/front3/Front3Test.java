package edu.coding_bat.warmup_1.front3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Front3Test {
    Front3 fro3 = new Front3();

    @Test
    public void front3_1() {
        assertEquals(fro3.front3("java"), "javjavjav");
    }

    @Test
    public void front3_2() {
        assertEquals(fro3.front3("Chocolate"), "ChoChoCho");
    }

    @Test
    public void front3_3() {
        assertEquals(fro3.front3("abc"), "abcabcabc");
    }

    @Test
    public void front3_4() {
        assertEquals(fro3.front3("abcXYZ"), "abcabcabc");
    }

    @Test
    public void front3_5() {
        assertEquals(fro3.front3("ab"), "ababab");
    }

    @Test
    public void front3_6() {
        assertEquals(fro3.front3("a"), "aaa");
    }

    @Test
    public void front3_7() {
        assertEquals(fro3.front3(""), "");
    }

    @Test
    public void front3_8() {
        assertEquals(fro3.front3E(""), "");
    }

    @Test
    public void front3_9() {
        assertEquals(fro3.front3E("ab"), "ababab");
    }

    @Test
    public void front3_10() {
        assertEquals(fro3.front3E("java"), "javjavjav");
    }
}