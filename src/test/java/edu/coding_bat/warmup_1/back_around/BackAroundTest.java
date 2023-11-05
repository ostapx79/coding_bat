package edu.coding_bat.warmup_1.back_around;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackAroundTest {
    BackAround backA = new BackAround();

    @Test
    public void backAround1Test() {
        assertEquals(backA.backAround("cat"), "tcatt");
    }

    @Test
    public void backAround2Test() {
        assertEquals(backA.backAround("Hello"), "oHelloo");
    }

    @Test
    public void backAround3Test() {
        assertEquals(backA.backAround("a"), "aaa");
    }

    @Test
    public void backAround4Test() {
        assertEquals(backA.backAround(""), "");
    }

    @Test
    public void backAround5Test() {
        assertEquals(backA.backAround("abc"), "cabcc");
    }

    @Test
    public void backAround6Test() {
        assertEquals(backA.backAround("read"), "dreadd");
    }

    @Test
    public void backAround7Test() {
        assertEquals(backA.backAround("boo"), "obooo");
    }

}