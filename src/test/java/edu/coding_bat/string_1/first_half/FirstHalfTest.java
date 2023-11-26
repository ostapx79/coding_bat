package edu.coding_bat.string_1.first_half;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstHalfTest {
    FirstHalf firstHalf = new FirstHalf();

    @Test
    public void setFirstHalf1Test() {
        assertEquals(firstHalf.firstHalf("WooHoo"), "Woo");
    }

    @Test
    public void setFirstHalf2Test() {
        assertEquals(firstHalf.firstHalf("HelloThere"), "Hello");
    }

    @Test
    public void setFirstHalf3Test() {
        assertEquals(firstHalf.firstHalf("abcdef"), "abc");
    }

    @Test
    public void setFirstHalf4Test() {
        assertEquals(firstHalf.firstHalf("ab"), "a");
    }

    @Test
    public void setFirstHalf5Test() {
        assertEquals(firstHalf.firstHalf(""), "");
    }

    @Test
    public void setFirstHalf6Test() {
        assertEquals(firstHalf.firstHalf("0123456789"), "01234");
    }

    @Test
    public void setFirstHalf7Test() {
        assertEquals(firstHalf.firstHalf("Kitten"), "Kit");
    }

}