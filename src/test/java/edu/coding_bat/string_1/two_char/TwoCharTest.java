package edu.coding_bat.string_1.two_char;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoCharTest {
    TwoChar twoChar = new TwoChar();

    @Test
    public void setTwoChar1Test() {
        assertEquals(twoChar.twoChar("java", 0), "ja");
    }

    @Test
    public void setTwoChar2Test() {
        assertEquals(twoChar.twoChar("java", 2), "va");
    }

    @Test
    public void setTwoChar3Test() {
        assertEquals(twoChar.twoChar("java", 3), "ja");
    }

    @Test
    public void setTwoChar4Test() {
        assertEquals(twoChar.twoChar("java", 4), "ja");
    }

    @Test
    public void setTwoChar5Test() {
        assertEquals(twoChar.twoChar("java", -1), "ja");
    }

    @Test
    public void setTwoChar6Test() {
        assertEquals(twoChar.twoChar("Hello", 0), "He");
    }

    @Test
    public void setTwoChar7Test() {
        assertEquals(twoChar.twoChar("Hello", 1), "el");
    }

    @Test
    public void setTwoChar8Test() {
        assertEquals(twoChar.twoChar("Hello", 99), "He");
    }

    @Test
    public void setTwoChar9Test() {
        assertEquals(twoChar.twoChar("Hello", 3), "lo");
    }

    @Test
    public void setTwoChar10Test() {
        assertEquals(twoChar.twoChar("Hello", 4), "He");
    }

    @Test
    public void setTwoChar11Test() {
        assertEquals(twoChar.twoChar("Hello", 5), "He");
    }

    @Test
    public void setTwoChar12Test() {
        assertEquals(twoChar.twoChar("Hello", -7), "He");
    }

    @Test
    public void setTwoChar13Test() {
        assertEquals(twoChar.twoChar("Hello", 6), "He");
    }

    @Test
    public void setTwoChar14Test() {
        assertEquals(twoChar.twoChar("Hello", -1), "He");
    }

    @Test
    public void setTwoChar15Test() {
        assertEquals(twoChar.twoChar("yay", 0), "ya");
    }
}