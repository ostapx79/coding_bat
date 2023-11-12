package edu.coding_bat.warmup_2.front_times;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrontTimesTest {
    /*
    Учитывая строку и неотрицательное целое число n, мы скажем,
    что начало строки — это первые 3 символа или что-то еще,
    если длина строки меньше 3. Вернуть n копий начала;
     */
    FrontTimes frontT = new FrontTimes();

    @Test
    public void frontTimes1Test() {
        assertEquals(frontT.frontTimes("Chocolate", 2), "ChoCho");
    }

    @Test
    public void frontTimes2Test() {
        assertEquals(frontT.frontTimes("Chocolate", 3), "ChoChoCho");
    }

    @Test
    public void frontTimes3Test() {
        assertEquals(frontT.frontTimes("Abc", 3), "AbcAbcAbc");
    }

    @Test
    public void frontTimes4Test() {
        assertEquals(frontT.frontTimes("Ab", 4), "AbAbAbAb");
    }

    @Test
    public void frontTimes5Test() {
        assertEquals(frontT.frontTimes("A", 4), "AAAA");
    }

    @Test
    public void frontTimes6Test() {
        assertEquals(frontT.frontTimes("", 4), "");
    }

    @Test
    public void frontTimes7Test() {
        assertEquals(frontT.frontTimes("Abc", 0), "");
    }

    @Test
    public void frontTimes8Test() {
        assertEquals(frontT.frontTimesT("Chocolate", 2), "ChoCho");
    }

    @Test
    public void frontTimes9Test() {
        assertEquals(frontT.frontTimesT("Chocolate", 3), "ChoChoCho");
    }

    @Test
    public void frontTimes10Test() {
        assertEquals(frontT.frontTimesT("Abc", 3), "AbcAbcAbc");
    }

    @Test
    public void frontTimes11Test() {
        assertEquals(frontT.frontTimesT("Ab", 4), "AbAbAbAb");
    }

    @Test
    public void frontTimes12Test() {
        assertEquals(frontT.frontTimesT("A", 4), "AAAA");
    }

    @Test
    public void frontTimes13Test() {
        assertEquals(frontT.frontTimesT("", 4), "");
    }

    @Test
    public void frontTimes14Test() {
        assertEquals(frontT.frontTimesT("Abc", 0), "");
    }
}