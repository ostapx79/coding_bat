package edu.coding_bat.string_1.see_color;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeeColorTest {
    SeeColor seeColor = new SeeColor();

    @Test
    public void setSeeColor1Test() {
        assertEquals(seeColor.seeColor("redxx"), "red");
    }

    @Test
    public void setSeeColor2Test() {
        assertEquals(seeColor.seeColor("xxred"), "");
    }

    @Test
    public void setSeeColor3Test() {
        assertEquals(seeColor.seeColor("blueTimes"), "blue");
    }

    @Test
    public void setSeeColor4Test() {
        assertEquals(seeColor.seeColor("NoColor"), "");
    }

    @Test
    public void setSeeColor5Test() {
        assertEquals(seeColor.seeColor("red"), "red");
    }

    @Test
    public void setSeeColor6Test() {
        assertEquals(seeColor.seeColor("re"), "");
    }

    @Test
    public void setSeeColor7Test() {
        assertEquals(seeColor.seeColor("blu"), "");
    }

    @Test
    public void setSeeColor8Test() {
        assertEquals(seeColor.seeColor("blue"), "blue");
    }

    @Test
    public void setSeeColor9Test() {
        assertEquals(seeColor.seeColor("a"), "");
    }

    @Test
    public void setSeeColor10Test() {
        assertEquals(seeColor.seeColor(""), "");
    }

    @Test
    public void setSeeColor11Test() {
        assertEquals(seeColor.seeColor("xyzred"), "");
    }
}