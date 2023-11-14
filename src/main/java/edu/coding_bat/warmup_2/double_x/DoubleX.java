package edu.coding_bat.warmup_2.double_x;

public class DoubleX {
    public boolean doubleX(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return false;
        } else if (str.length() < 3) {
            if (str.startsWith("xx")) return true;
        } else {
            return false;
        }

        String subStr = str.substring(0, 2);
        // int count = 0;

        for (int i = 0; i < subStr.length(); i++) {
            if (subStr.startsWith("xx")) return true;
        }
        // return !(count > 0);
        return false;
    }
}
