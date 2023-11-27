package edu.coding_bat.string_1.the_end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheEndTest {
    TheEnd theEnd = new TheEnd();

    @Test
    public void setTheEnd1Test() {
        assertEquals(theEnd.theEnd("Hello", true), "H");
    }

    @Test
    public void setTheEnd2Test() {
        assertEquals(theEnd.theEnd("Hello", false), "o");
    }

    @Test
    public void setTheEnd3Test() {
        assertEquals(theEnd.theEnd("oh", true), "o");
    }

    @Test
    public void setTheEnd4Test() {
        assertEquals(theEnd.theEnd("x", true), "x");
    }

    @Test
    public void setTheEnd5Test() {
        assertEquals(theEnd.theEnd("x", false), "x");
    }

    @Test
    public void setTheEnd6Test() {
        assertEquals(theEnd.theEnd("java", true), "j");
    }

    @Test
    public void setTheEnd7Test() {
        assertEquals(theEnd.theEnd("Chocolate", false), "e");
    }

    @Test
    public void setTheEnd8Test() {
        assertEquals(theEnd.theEnd("12345", true), "1");
    }

    @Test
    public void setTheEnd9Test() {
        assertEquals(theEnd.theEnd("code", false), "e");
    }

}