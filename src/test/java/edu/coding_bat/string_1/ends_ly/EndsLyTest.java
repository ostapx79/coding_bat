package edu.coding_bat.string_1.ends_ly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndsLyTest {
    EndsLy endsLy = new EndsLy();

    @Test
    public void setEndsLy1Test() {
        assertTrue(endsLy.endsLy("oddly"));
    }

    @Test
    public void setEndsLy2Test() {
        assertFalse(endsLy.endsLy("y"));
    }

    @Test
    public void setEndsLy3Test() {
        assertFalse(endsLy.endsLy("oddy"));
    }

    @Test
    public void setEndsLy4Test() {
        assertEquals(endsLy.endsLy("oddl"), false);
    }

    @Test
    public void setEndsLy5Test() {
        assertEquals(endsLy.endsLy("olydd"), false);
    }

    @Test
    public void setEndsLy6Test() {
        assertEquals(endsLy.endsLy("ly"), true);
    }

    @Test
    public void setEndsLy7Test() {
        assertEquals(endsLy.endsLy(""), false);
    }

    @Test
    public void setEndsLy8Test() {
        assertEquals(endsLy.endsLy("falsey"), false);
    }

    @Test
    public void setEndsLy9Test() {
        assertEquals(endsLy.endsLy("evenly"), true);
    }

}