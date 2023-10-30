package edu.coding_bat.strings;

public class TwoE {
    public static boolean twoE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            String sub = str.substring(i, i + 1);
            if (sub.equals("e")) count++;
        }

        return count == 2;
    }
}
