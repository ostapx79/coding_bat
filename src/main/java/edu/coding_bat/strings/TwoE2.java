package edu.coding_bat.strings;

public class TwoE2 {
    public static boolean twoE2(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count == 2);
    }
}
