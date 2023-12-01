package edu.coding_bat.string_1.min_cat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCatTest {
    MinCat minCat = new MinCat();

    @Test
    public void setMinCat1Test() {
        assertEquals(minCat.minCat("Hello", "Hi"), "loHi");
    }

    @Test
    public void setMinCat2Test() {
        assertEquals(minCat.minCat("Hello", "java"), "ellojava");
    }

    @Test
    public void setMinCat3Test() {
        assertEquals(minCat.minCat("java", "Hello"), "javaello");
    }

    @Test
    public void setMinCat4Test() {
        assertEquals(minCat.minCat("abc", "x"), "cx");
    }

    @Test
    public void setMinCat5Test() {
        assertEquals(minCat.minCat("x", "abc"), "xc");
    }

    @Test
    public void setMinCat6Test() {
        assertEquals(minCat.minCat("abc", ""), "");
    }

    @Test
    public void setMinCat7Test() {
        assertEquals(minCat.minCat("", "abc"), "");
    }
}