package edu.coding_bat.string_1.front_again;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontAgainTest {
    FrontAgain frontAgain = new FrontAgain();

    @Test
    public void setFrontAgain1Test() {
        assertTrue(frontAgain.frontAgain("edited"));
    }

    @Test
    public void setFrontAgain2Test() {
        assertFalse(frontAgain.frontAgain("edit"));
    }

    @Test
    public void setFrontAgain3Test() {
        assertTrue(frontAgain.frontAgain("ed"));
    }

    @Test
    public void setFrontAgain4Test() {
        assertTrue(frontAgain.frontAgain("jj"));
    }

    @Test
    public void setFrontAgain5Test() {
        assertTrue(frontAgain.frontAgain("jjj"));
    }

    @Test
    public void setFrontAgain6Test() {
        assertFalse(frontAgain.frontAgain("jjjk"));
    }

    @Test
    public void setFrontAgain7Test() {
        assertFalse(frontAgain.frontAgain("x"));
    }

    @Test
    public void setFrontAgain8Test() {
        assertFalse(frontAgain.frontAgain(""));
    }

    @Test
    public void setFrontAgain9Test() {
        assertFalse(frontAgain.frontAgain("java"));
    }

    @Test
    public void setFrontAgain10Test() {
        assertTrue(frontAgain.frontAgain("javaja"));
    }

}