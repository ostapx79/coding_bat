package edu.coding_bat.warmup_1.lone_teen;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        if (a == b) return false;


        if ((a > 12 && a < 20) || (b > 12 && b < 20)) {

            boolean isOneA = false;
            boolean isTwoB = false;

            if (a > 12 && a < 20) isOneA = true;
            if (b > 12 && b < 20) isTwoB = true;

            if (isOneA && isTwoB) return false;
        }

        return true;
    }
}
