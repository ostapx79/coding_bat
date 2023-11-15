package edu.coding_bat.warmup_2.string_splosion;

public class StringSplosion {
    public String stringSplosion(String str) {
        String res = "";
        for (int i = 1; i <= str.length(); i++) {
            res += str.substring(0, i);
        }
        return res;
    }
}
