package edu.coding_bat.warmup_2.double_x;

public class DoubleX {
    public boolean doubleX(String str) {

        if (str.isEmpty() || str.length() == 1) {
            return false;
        } else if (str.length() < 3) {
            if (str.startsWith("xx")) return true;
        }

        String subStr = str.substring(0, 3);

        for (int i = 0; i < subStr.length(); i++) {
            if (subStr.startsWith("xx", i)) return true;
        }
        return false;
    }

    public boolean doubleXT(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i + 1 >= str.length()) return false;
        return str.substring(i + 1, i + 2).equals("x");
    }
}
