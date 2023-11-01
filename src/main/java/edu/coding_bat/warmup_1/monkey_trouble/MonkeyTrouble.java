package edu.coding_bat.warmup_1.monkey_trouble;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) return true;
        if (!aSmile && !bSmile) return true;
        return false;
    }
}
