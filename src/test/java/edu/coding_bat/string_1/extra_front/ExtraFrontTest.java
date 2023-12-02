package edu.coding_bat.string_1.extra_front;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtraFrontTest {
    ExtraFront extraFront = new ExtraFront();

    @Test
    public void setExtraFront1TEst() {
        assertEquals(extraFront.extraFront("Hello"), "HeHeHe");
    }

    @Test
    public void setExtraFront2Test() {
        assertEquals(extraFront.extraFront("ab"), "ababab");
    }

    @Test
    public void setExtraFront3Test() {
        assertEquals(extraFront.extraFront("H"), "HHH");
    }

    @Test
    public void setExtraFront4Test() {
        assertEquals(extraFront.extraFront(""), "");
    }

    @Test
    public void setExtraFront5Test() {
        assertEquals(extraFront.extraFront("Candy"), "CaCaCa");
    }

    @Test
    public void setExtraFront6Test() {
        assertEquals(extraFront.extraFront("Code"), "CoCoCo");
    }

}