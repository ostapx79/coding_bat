package edu.coding_bat.warmup_2.string_splosion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTest {
    StringSplosion stringS = new StringSplosion();

    @Test
    public void stringSplosion1Test() {
        assertEquals(stringS.stringSplosion("Code"), "CCoCodCode");
    }

    @Test
    public void stringSplosion2Test() {
        assertEquals(stringS.stringSplosion("abc"), "aababc");
    }

    @Test
    public void stringSplosion3Test() {
        assertEquals(stringS.stringSplosion("ab"), "aab");
    }

    @Test
    public void stringSplosion4Test() {
        assertEquals(stringS.stringSplosion("x"), "x");
    }

    @Test
    public void stringSplosion5Test() {
        assertEquals(stringS.stringSplosion("fade"), "ffafadfade");
    }

    @Test
    public void  stringSplosion6Test() {
        assertEquals(stringS.stringSplosion("There"), "TThTheTherThere");
    }

    @Test
    public void stringSplosion7Test() {
        assertEquals(stringS.stringSplosion("Kitten"), "KKiKitKittKitteKitten");
    }

    @Test
    public void stringSplosion8Test() {
        assertEquals(stringS.stringSplosion("Bye"), "BByBye");
    }

    @Test
    public void stringSplosion9Test() {
        assertEquals(stringS.stringSplosion("Good"), "GGoGooGood");
    }

    @Test
    public void stringSplosion10Test() {
        assertEquals(stringS.stringSplosion("Bad"), "BBaBad");
    }

}