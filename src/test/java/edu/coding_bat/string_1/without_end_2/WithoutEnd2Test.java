package edu.coding_bat.string_1.without_end_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WithoutEnd2Test {
    WithoutEnd2 withoutEnd2 = new WithoutEnd2();

    @Test
    public void setWithoutEnd2_1Test() {
        assertEquals(withoutEnd2.withoutEnd2("Hello"), "ell");
    }

    @Test
    public void setWithoutEnd2_2Test() {
        assertEquals(withoutEnd2.withoutEnd2("abc"), "b");
    }

    @Test
    public void setWithoutEnd2_3Test() {
        assertEquals(withoutEnd2.withoutEnd2("ab"), "");
    }

    @Test
    public void setWithoutEnd2_4Test() {
        assertEquals(withoutEnd2.withoutEnd2("a"), "");
    }

    @Test
    public void setWithoutEnd2_5Test() {
        assertEquals(withoutEnd2.withoutEnd2(""), "");
    }

    @Test
    public void setWithoutEnd2_6Test() {
        assertEquals(withoutEnd2.withoutEnd2("coldy"), "old");
    }

    @Test
    public void setWithoutEnd2_7Test() {
        assertEquals(withoutEnd2.withoutEnd2("java code"), "ava cod");
    }

}