package edu.coding_bat.warmup_2.count_xx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountXXTest {
    /*
    Подсчитайте количество «xx» в данной строке.
    Мы скажем, что перекрытие разрешено,
    поэтому «xxx» содержит 2 «xx».
     */
    CountXX countXX = new CountXX();

    @Test
    public void countXX1Test() {
        assertEquals(countXX.countXX("abcxx"), 1);
    }

    @Test
    public void countXX2Test() {
        assertEquals(countXX.countXX("xxx"), 2);
    }

    @Test
    public void countXX3Test() {
        assertEquals(countXX.countXX("xxxx"), 3);
    }

    @Test
    public void countXX4Test() {
        assertEquals(countXX.countXX("abc"), 0);
    }

    @Test
    public void countXX5Test() {
        assertEquals(countXX.countXX("Hello there"), 0);
    }

    @Test
    public void countXX6Test() {
        assertEquals(countXX.countXX("Hexxo thxxe"), 2);
    }

    @Test
    public void countXX7Test() {
        assertEquals(countXX.countXX(""), 0);
    }

    @Test
    public void countXX8Test() {
        assertEquals(countXX.countXX("Kittens"), 0);
    }

    @Test
    public void countXX9Test() {
        assertEquals(countXX.countXX("Kittensxxx"), 2);
    }

    @Test
    public void countXX10Test() {
        assertEquals(countXX.countXXT("abcxx"), 1);
    }

    @Test
    public void countXX11Test() {
        assertEquals(countXX.countXXT("xxx"), 2);
    }

    @Test
    public void countXX12Test() {
        assertEquals(countXX.countXXT("xxxx"), 3);
    }

    @Test
    public void countXX13Test() {
        assertEquals(countXX.countXXT("abc"), 0);
    }

    @Test
    public void countXX14Test() {
        assertEquals(countXX.countXXT("Hello there"), 0);
    }

    @Test
    public void countXX15Test() {
        assertEquals(countXX.countXXT("Hexxo thxxe"), 2);
    }

    @Test
    public void countXX16Test() {
        assertEquals(countXX.countXXT(""), 0);
    }

    @Test
    public void countXX17Test() {
        assertEquals(countXX.countXXT("Kittens"), 0);
    }

    @Test
    public void countXX18Test() {
        assertEquals(countXX.countXXT("Kittensxxx"), 2);
    }

    @Test
    public void countXX19Test() {
        assertEquals(countXX.countXXTT("abcxx"), 1);
    }

    @Test
    public void countXX20Test() {
        assertEquals(countXX.countXXTT("xxx"), 2);
    }

    @Test
    public void countXX21Test() {
        assertEquals(countXX.countXXTT("xxxx"), 3);
    }

    @Test
    public void countXX23Test() {
        assertEquals(countXX.countXXTT("abc"), 0);
    }

    @Test
    public void countXX24Test() {
        assertEquals(countXX.countXXTT("Hello there"), 0);
    }

    @Test
    public void countXX25Test() {
        assertEquals(countXX.countXXTT("Hexxo thxxe"), 2);
    }

    @Test
    public void countXX26Test() {
        assertEquals(countXX.countXXTT(""), 0);
    }

    @Test
    public void countXX27Test() {
        assertEquals(countXX.countXXTT("Kittens"), 0);
    }

    @Test
    public void countXX28Test() {
        assertEquals(countXX.countXXTT("Kittensxxx"), 2);
    }

}