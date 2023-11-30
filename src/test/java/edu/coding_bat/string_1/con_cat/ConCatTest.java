package edu.coding_bat.string_1.con_cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConCatTest {
    ConCat conCat = new ConCat();

    @Test
    public void setConCat1Test() {
        assertEquals(conCat.conCat("abc", "cat"), "abcat");
    }

    @Test
    public void setConCat2Test() {
        assertEquals(conCat.conCat("dog", "cat"), "dogcat");
    }

    @Test
    public void setConCat3Test() {
        assertEquals(conCat.conCat("abc", ""), "abc");

    }

    @Test
    public void setConCat4Test() {
        assertEquals(conCat.conCat("", "cat"), "cat");
    }

    @Test
    public void setConCat5Test() {
        assertEquals(conCat.conCat("pig", "g"), "pig");
    }

    @Test
    public void setConCat6Test() {
        assertEquals(conCat.conCat("pig", "doggy"), "pigdoggy");
    }

}