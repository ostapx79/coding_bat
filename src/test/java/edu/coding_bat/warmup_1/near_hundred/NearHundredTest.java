package edu.coding_bat.warmup_1.near_hundred;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearHundredTest {
    // hearHundred(93) -> true
    // hearHundred(90) -> true
    // hearHundred(89) -> false
    // Учитывая целое число n, верните true, если оно находится
    // в пределах 10 от 100 или 200. Примечание.
    // Math.abs(num) вычисляет абсолютное значение числа.
    NearHundred near = new NearHundred();

    @Test
    public void nearHundredTest() {
        assertTrue(near.nearHundred(93));
    }

    @Test
    public void nearHundred2Test() {
        assertTrue(near.nearHundred(90));
    }

    @Test
    public void nearHundred3Test() {
        assertFalse(near.nearHundred(89));
    }

    @Test
    public void nearHundred4Test() {
        assertTrue(near.nearHundred(110));
    }

    @Test
    public void nearHundred5Test() {
        assertFalse(near.nearHundred(111));
    }

    @Test
    public void nearHundred6Test() {
        assertFalse(near.nearHundred(121));
    }

    @Test
    public void nearHundred7Test() {
        assertFalse(near.nearHundred(-101));
    }

    @Test
    public void nearHundred8Test() {
        assertFalse(near.nearHundred(-209));
    }

    @Test
    public void nearHundred9Test() {
        assertTrue(near.nearHundred(190));
    }

    @Test
    public void nearHundred10Test() {
        assertTrue(near.nearHundred(209));
    }

    @Test
    public void nearHundred11Test() {
        assertFalse(near.nearHundred(0));
    }

    @Test
    public void nearHundred12Test() {
        assertFalse(near.nearHundred(5));
    }

    @Test
    public void nearHundred13Test() {
        assertFalse(near.nearHundred(-50));
    }

    @Test
    public void nearHundred14Test() {
        assertTrue(near.nearHundred(191));
    }

    @Test
    public void nearHundred15Test() {
        assertFalse(near.nearHundred(189));
    }

    @Test
    public void nearHundred16Test() {
        assertTrue(near.nearHundred(200));
    }

    @Test
    public void nearHundred17Test() {
        assertTrue(near.nearHundred(210));
    }

    @Test
    public void nearHundred18Test() {
        assertFalse(near.nearHundred(211));
    }

    @Test
    public void nearHundred19Test() {
        assertFalse(near.nearHundred(290));
    }
}