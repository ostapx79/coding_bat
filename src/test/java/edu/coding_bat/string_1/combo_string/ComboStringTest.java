package edu.coding_bat.string_1.combo_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComboStringTest {
    ComboString comboString = new ComboString();

    @Test
    public void setComboString1Test() {
        assertEquals(comboString.comboString("Hello", "hi"), "hiHellohi");
    }

    @Test
    public void setComboString2Test() {
        assertEquals(comboString.comboString("hi", "Hello"), "hiHellohi");
    }

    @Test
    public void setComboString3Test() {
        assertEquals(comboString.comboString("aaa", "b"), "baaab");
    }
    @Test
    public void setComboString4Test() {
        assertEquals(comboString.comboString("aaa", ""), "aaa");
    }

    @Test
    public void setComboString5Test() {
        assertEquals(comboString.comboString("", "bb"), "bb");
    }

    @Test
    public void setComboString6Test() {
        assertEquals(comboString.comboString("aaa", "1234"), "aaa1234aaa");
    }

    @Test
    public void setComboString7Test() {
        assertEquals(comboString.comboString("aaa", "bb"), "bbaaabb");
    }

    @Test
    public void setComboString8Test() {
        assertEquals(comboString.comboString("a", "bb"), "abba");
    }

    @Test
    public void setComboString9Test() {
        assertEquals(comboString.comboString("bb", "a"), "abba");
    }

    @Test
    public void setComboString10Test() {
        assertEquals(comboString.comboString("xzy", "ab"), "abxzyab");
    }

}