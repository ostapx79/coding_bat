package edu.coding_bat.string_1.right_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Right2Test {
    Right2 right2 = new Right2();

    @Test
    public void setRight2_1Test() {
        assertEquals(right2.right2("Hello"), "loHel");
    }

    @Test
    public void setRight2_2Test() {
        assertEquals(right2.right2("java"), "vaja");
    }

    @Test
    public void setRight2_3Test() {
        assertEquals(right2.right2("Hi"), "Hi");
    }

    @Test
    public void setRight2_4Test() {
        assertEquals(right2.right2("code"), "deco");
    }

    @Test
    public void setRight2_5Test() {
        assertEquals(right2.right2("cat"), "atc");
    }

    @Test
    public void setRight2_6Test() {
        assertEquals(right2.right2("12345"), "45123");
    }

}