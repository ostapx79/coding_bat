package edu.coding_bat.warmup_1.end_up;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EndUpTest {
    EndUp endU = new EndUp();

    @Test
    public void endUp1Test() {
        assertEquals(endU.endUp("Hello"), "HeLLO");
    }

    @Test
    public void endUp2Test() {
        assertEquals(endU.endUp("hi there"), "hi thERE");
    }

    @Test
    public void endUp3Test() {
        assertEquals(endU.endUp("hi"), "HI");
    }

    @Test
    public void endUp4Test() {
        assertEquals(endU.endUp("woo hoo"), "woo HOO");
    }

    @Test
    public void endUp5Test() {
        assertEquals(endU.endUp("xyz12"), "xyZ12");
    }

    @Test
    public void endUp6Test() {
        assertEquals(endU.endUp("x"), "X");
    }

    @Test
    public void endUp7Test() {
        assertEquals(endU.endUp(""), "");
    }

    @Test
    public void endUp8Test() {
        assertEquals(endU.endUpT("Hello"), "HeLLO");
    }

    @Test
    public void endUp9Test() {
        assertEquals(endU.endUpT("hi there"), "hi thERE");
    }

    @Test
    public void endUp10Test() {
        assertEquals(endU.endUpT("hi"), "HI");
    }

    @Test
    public void endUp11Test() {
        assertEquals(endU.endUpT("woo hoo"), "woo HOO");
    }

    @Test
    public void endUp12Test() {
        assertEquals(endU.endUpT("xyz12"), "xyZ12");
    }

    @Test
    public void endUp13Test() {
        assertEquals(endU.endUpT("x"), "X");
    }

    @Test
    public void endUp14Test() {
        assertEquals(endU.endUpT(""), "");
    }

}