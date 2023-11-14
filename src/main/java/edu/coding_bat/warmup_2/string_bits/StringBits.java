package edu.coding_bat.warmup_2.string_bits;

public class StringBits {
    public String stringBits(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i += 2) {
            res += str.charAt(i);
            // alternative could use str.substring(i, i+1)
        }
        return res;
    }
}
