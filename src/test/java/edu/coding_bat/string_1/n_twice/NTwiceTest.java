package edu.coding_bat.string_1.n_twice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NTwiceTest {
    NTwice nTwice = new NTwice();

    @Test
    public void setNTwice1Test() {
        assertEquals(nTwice.nTwice("Hello", 2), "Helo");
    }

    @Test
    public void setNTwice2Test() {
        assertEquals(nTwice.nTwice("Chocolate", 3), "Choate");
    }

    @Test
    public void setNTwice3Test() {
        assertEquals(nTwice.nTwice("Chocolate", 1), "Ce");
    }

    @Test
    public void setNTwice4Test() {
        assertEquals(nTwice.nTwice("Chocolate", 0), "");
    }

    @Test
    public void setNTwice5Test() {
        assertEquals(nTwice.nTwice("Hello", 4), "Hellello");
    }

    @Test
    public void setNTwice6Test() {
        assertEquals(nTwice.nTwice("Code", 4), "CodeCode");
    }

    @Test
    public void setNTwice7Test() {
        assertEquals(nTwice.nTwice("Code", 2), "Code");
    }
}