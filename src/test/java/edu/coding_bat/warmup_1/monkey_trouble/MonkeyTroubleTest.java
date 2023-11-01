package edu.coding_bat.warmup_1.monkey_trouble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MonkeyTroubleTest {

    MonkeyTrouble monkeyTrouble;

    @Test
    public void monkeyTroubleTrueTest() {
        monkeyTrouble = new MonkeyTrouble();
        boolean aSmile = true;
        boolean bSmile = true;
        boolean monkeySmile = monkeyTrouble.monkeyTrouble(aSmile, bSmile);

        assertTrue(monkeySmile);
    }

    @Test
    public void monkeyTroubleNotFalseTest() {
        monkeyTrouble = new MonkeyTrouble();
        boolean aSmile = false;
        boolean bSmile = false;
        boolean monkeyNotSmile = monkeyTrouble.monkeyTrouble(aSmile, bSmile);

        assertTrue(monkeyNotSmile);
    }

    @Test
    public void monkeyTroubleTrueFalseTest() {
        monkeyTrouble = new MonkeyTrouble();
        boolean aSmile1 = true;
        boolean bSmile1 = false;
        boolean monkeys1 = monkeyTrouble.monkeyTrouble(aSmile1, bSmile1);

        assertFalse(monkeys1);
    }

    @Test
    public void monkeyTroubleFalseTrueTest() {
        monkeyTrouble = new MonkeyTrouble();
        boolean aSmile2 = false;
        boolean bSmile2 = true;
        boolean monkeys2 = monkeyTrouble.monkeyTrouble(aSmile2, bSmile2);

        assertFalse(monkeys2);
    }
}