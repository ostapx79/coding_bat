package edu.coding_bat.warmup_2.double_x;

public class DoubleX {
    public boolean doubleX(String str) {
        int count = 0;
        for (int i = 0; i  < str.length() - 1; i++) {
            if (str.startsWith("xx", i)) count++;
        }
        return (count >= 1);
    }
}
