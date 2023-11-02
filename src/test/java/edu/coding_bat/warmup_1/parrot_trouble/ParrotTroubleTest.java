package edu.coding_bat.warmup_1.parrot_trouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParrotTroubleTest {
    ParrotTrouble parrot = new ParrotTrouble();
    // У нас есть громко говорящий попугай.
    // Параметр «час» — текущее время часа в диапазоне 0..23.
    // У нас проблемы, если попугай разговаривает,
    // а час до 7 или после 20. Верните true, если у нас проблемы.
    // parrotTrouble(true, 6) → true
    // parrotTrouble(true, 7) → false
    // parrotTrouble(false, 6) → false

    @Test
    public void parrotTrouble1Test() {
       boolean talking = true;
       int hour = 6;
       boolean res = parrot.parrotTrouble(talking, hour);

        assertEquals(res, true);
    }

    @Test
    public void parrotTrouble2Test() {
        boolean talking = false;
        int hour = 7;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }

    @Test
    public void parrotTrouble3Test() {
        boolean talking = false;
        int hour = 6;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }

    @Test
    public void parrotTrouble4Test() {
        boolean talking = true;
        int hour = 21;

        assertEquals(parrot.parrotTrouble(talking, hour), true);
    }

    @Test
    public void parrotTrouble5Test() {
        boolean talking = false;
        int hour = 21;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }

    @Test
    public void parrotTrouble6Test() {
        boolean talking = false;
        int hour = 20;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }

    @Test
    public void parrotTrouble7Test() {
        boolean talking = true;
        int hour = 23;

        assertEquals(parrot.parrotTrouble(talking, hour), true);
    }

    @Test
    public void parrotTrouble8Test() {
        boolean talking = false;
        int hour = 23;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }

    @Test
    public void parrotTrouble9Test() {
        boolean talking = true;
        int hour = 20;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }

    @Test
    public void parrotTrouble10Test() {
        boolean talking = false;
        int hour = 12;

        assertEquals(parrot.parrotTrouble(talking, hour), false);
    }
}