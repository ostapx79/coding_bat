package edu.coding_bat.warmup_2.alt_pairs;

public class AltPairs {
    public String altPairs(String str) {

        var res = "";

        if (str.length() == 1) res += str;

        for (int i = 0; i < str.length() - 1; i += 4) {
            res += str.substring(i, i + 2);

        }

        if (str.length() % 2 != 0 && str.length() > 3) {
            res += str.substring(str.length() - 1);
        }

        return res;
    }

    public String altPairsT(String str) {
        String result = "";

        // Run i by 4 to hit 0, 4, 8, ...
        for (int i=0; i<str.length(); i += 4) {
            // Append the chars between i and i+2
            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }
}
