package edu.coding_bat.string_1.at_first;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtFirstTest {
    AtFirst atFirst = new AtFirst();

    @Test
    public void setAtFirst1Test() {
        assertEquals(atFirst.atFirst("Hello"), "He");
    }

    @Test
    public void setAtFirst2Test() {
        assertEquals(atFirst.atFirst("hi"), "hi");
    }

    @Test
    public void setAtFirst3Test() {
        assertEquals(atFirst.atFirst("h"), "h@");
    }

    @Test
    public void setAtFirst4Test() {
        assertEquals(atFirst.atFirst(""), "@@");
    }

    @Test
    public void setAtFirst5Test() {
        assertEquals(atFirst.atFirst("kitten"), "ki");
    }

    @Test
    public void setAtFirst6Test() {
        assertEquals(atFirst.atFirst("java"), "ja");
    }

    @Test
    public void setAtFirst7Test() {
        assertEquals(atFirst.atFirst("j"), "j@");
    }

}