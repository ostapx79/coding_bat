package edu.coding_bat.warmup_1.string_e;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringETest {
    /*
    Возвращает true, если данная строка содержит от 1 до 3 символов «e».
     */
    StringE strE = new StringE();

    @Test
    public void stringE1Test() {
        assertTrue(strE.stringE("Hello"));
    }

    @Test
    public void stringE2Test() {
        assertTrue(strE.stringE("Heelle"));
    }

    @Test
    public void stringE3Test() {
        assertFalse(strE.stringE("Heelele"));
    }

    @Test
    public void stringE4Test() {
        assertFalse(strE.stringE("Hll"));
    }

    @Test
    public void stringE5Test() {
        assertTrue(strE.stringE("e"));
    }

    @Test
    public void stringE6Test() {
        assertFalse(strE.stringE(""));
    }
    @Test
    public void stringE7Test() {
        assertTrue(strE.stringET("Hello"));
    }

    @Test
    public void stringE8Test() {
        assertTrue(strE.stringET("Heelle"));
    }

    @Test
    public void stringE9Test() {
        assertFalse(strE.stringET("Heelele"));
    }

    @Test
    public void stringE10Test() {
        assertFalse(strE.stringET("Hll"));
    }

    @Test
    public void stringE11Test() {
        assertTrue(strE.stringET("e"));
    }

    @Test
    public void stringE12Test() {
        assertFalse(strE.stringET(""));
    }
}