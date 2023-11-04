package edu.coding_bat.warmup_1.front_back;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontBackTest {
    FrontBack frontB = new FrontBack();

    @Test
    public void frontBack1Test() {
        assertEquals(frontB.frontBack("code"), "eodc");
    }

    @Test
    public void frontBack2Test() {
        assertEquals(frontB.frontBack("a"), "a");
    }

    @Test
    public void frontBack3Test() {
        assertEquals(frontB.frontBack("ab"), "ba");
    }

    @Test
    public void frontBack4Test() {
        assertEquals(frontB.frontBack("abc"), "cba");
    }

    @Test
    public void frontBack5Test() {
        assertEquals(frontB.frontBack(""), "");
    }

    @Test
    public void frontBack6Test() {
        assertEquals(frontB.frontBack("Chocolate"), "ehocolatC");
    }

    @Test
    public void frontBack7Test() {
        assertEquals(frontB.frontBack("aavJ"), "Java");
    }

    @Test
    public void frontBack8Test() {
        assertEquals(frontB.frontBack("hello"), "oellh");
    }
}