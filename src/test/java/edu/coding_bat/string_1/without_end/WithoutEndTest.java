package edu.coding_bat.string_1.without_end;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutEndTest {
    WithoutEnd withoutEnd = new WithoutEnd();

    @Test
    public void setWithoutEnd1Test() {
        assertEquals(withoutEnd.withoutEnd("Hello"), "ell");
    }

    @Test
    public void setWithoutEnd2Test() {
        assertEquals(withoutEnd.withoutEnd("java"), "av");
    }

    @Test
    public void setWithoutEnd3Test() {
        assertEquals(withoutEnd.withoutEnd("coding"), "odin");
    }

    @Test
    public void setWithoutEnd4Test() {
        assertEquals(withoutEnd.withoutEnd("code"), "od");
    }

    @Test
    public void setWithoutEnd5Test() {
        assertEquals(withoutEnd.withoutEnd("ab"), "");
    }

    @Test
    public void setWithoutEnd6Test() {
        assertEquals(withoutEnd.withoutEnd("Chocolate!"), "hocolate");
    }

    @Test
    public void setWithoutEnd7Test() {
        assertEquals(withoutEnd.withoutEnd("kitten"), "itte");
    }

    @Test
    public void setWithoutEnd8Test() {
        assertEquals(withoutEnd.withoutEnd("woohoo"), "ooho");
    }

}