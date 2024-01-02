package edu.coding_bat.logic_1.fizz_string2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzString2Test {
    FizzString2 fizzString2 = new FizzString2();

    @Test
    public void setFizzString2_1Test() {
        assertEquals(fizzString2.fizzString2(1), "1!");
    }

    @Test
    public void setFizzString2_2Test() {
        assertEquals(fizzString2.fizzString2(2), "2!");
    }

    @Test
    public void setFizzString2_3Test() {
        assertEquals(fizzString2.fizzString2(3), "Fizz!");
    }

    @Test
    public void setFizzString2_4Test() {
        assertEquals(fizzString2.fizzString2(4), "4!");
    }

    @Test
    public void setFizzString2_5Test() {
        assertEquals(fizzString2.fizzString2(5), "Buzz!");
    }

    @Test
    public void setFizzString2_6Test() {
        assertEquals(fizzString2.fizzString2(6), "Fizz!");
    }

    @Test
    public void setFizzString2_7Test() {
        assertEquals(fizzString2.fizzString2(7), "7!");
    }

    @Test
    public void setFizzString2_8Test() {
        assertEquals(fizzString2.fizzString2(8), "8!");
    }

    @Test
    public void setFizzString2_9Test() {
        assertEquals(fizzString2.fizzString2(9), "Fizz!");
    }

    @Test
    public void setFizzString2_10Test() {
        assertEquals(fizzString2.fizzString2(15), "FizzBuzz!");
    }

    @Test
    public void setFizzString2_11Test() {
        assertEquals(fizzString2.fizzString2(16), "16!");
    }

    @Test
    public void setFizzString2_12Test() {
        assertEquals(fizzString2.fizzString2(18), "Fizz!");
    }

    @Test
    public void setFizzString2_13Test() {
        assertEquals(fizzString2.fizzString2(19), "19!");
    }

    @Test
    public void setFizzString2_14Test() {
        assertEquals(fizzString2.fizzString2(21), "Fizz!");
    }

    @Test
    public void setFizzString2_15Test() {
        assertEquals(fizzString2.fizzString2(44), "44!");
    }

    @Test
    public void setFizzString2_16Test() {
        assertEquals(fizzString2.fizzString2(45), "FizzBuzz!");
    }

    @Test
    public void setFizzString2_17Test() {
        assertEquals(fizzString2.fizzString2(100), "Buzz!");
    }

}