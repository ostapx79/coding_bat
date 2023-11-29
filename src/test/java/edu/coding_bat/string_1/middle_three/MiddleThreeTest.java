package edu.coding_bat.string_1.middle_three;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleThreeTest {
    MiddleThree middleThree = new MiddleThree();

    @Test
    public void setMiddleThree1Test() {
        assertEquals(middleThree.middleThree("Candy"), "and");
    }

    @Test
    public void setMiddleThree2Test() {
        assertEquals(middleThree.middleThree("and"), "and");
    }

    @Test
    public void setMiddleThree3Test() {
        assertEquals(middleThree.middleThree("solving"), "lvi");
    }

    @Test
    public void setMiddleThree4Test() {
        assertEquals(middleThree.middleThree("Hi yet Hi"), "yet");
    }

    @Test
    public void setMiddleThree5Test() {
        assertEquals(middleThree.middleThree("java yet java"), "yet");
    }

    @Test
    public void setMiddleThree6Test() {
        assertEquals(middleThree.middleThree("Chocolate"), "col");
    }

    @Test
    public void setMiddleThree7Test() {
        assertEquals(middleThree.middleThree("XabcxyzabcX"), "xyz");
    }
}