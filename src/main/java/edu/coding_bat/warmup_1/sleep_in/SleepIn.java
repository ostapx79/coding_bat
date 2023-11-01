package edu.coding_bat.warmup_1.sleep_in;

public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) return true;
        return false;
    }
}
