package edu.coding_bat.warmup_2.count_xx;

public class CountXX {
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char w = str.charAt(i);
            if (w == 'x') count++;
            if (w == ' ') count--;
        }

        if (count == 0 || count < 0)
            if (count < 0) count += 2;
            else return count;

        return count - 1;
    }

    public int countXXT(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }

    public int countXXTT(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.startsWith("xx", i)) count++;
        }
        return count;
    }
}
