package edu.coding_bat.warmup_1.start_oz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StartOzTest {
    StartOz startO = new StartOz();

    @Test
    public void startOz1Test() {
        assertEquals(startO.startOz("ozymaindias"), "oz");
    }

    @Test
    public void startOz2Test() {
        assertEquals(startO.startOz("bzoo"), "z");
    }

    @Test
    public void startOz3Test() {
        assertEquals(startO.startOz("oxx"), "o");
    }

    @Test
    public void startOz4Test() {
        assertEquals(startO.startOz("ounce"), "o");
    }

    @Test
    public void startOz5Test() {
        assertEquals(startO.startOz("o"), "o");
    }

    @Test
    public void startOz6Test() {
        assertEquals(startO.startOz("abc"), "");
    }

    @Test
    public void startOz7Test() {
        assertEquals(startO.startOz(""), "");
    }

    @Test
    public void startOz8Test() {
        assertEquals(startO.startOz("zoo"), "");
    }

    @Test
    public void startOz9Test() {
        assertEquals(startO.startOz("aztec"), "z");
    }

    @Test
    public void startOz10Test() {
        assertEquals(startO.startOz("zzzz"), "z");
    }

    @Test
    public void startOz11Test() {
        assertEquals(startO.startOz("oznic"), "oz");
    }

}