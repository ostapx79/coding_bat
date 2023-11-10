package edu.coding_bat.warmup_1.string_e;

public class StringE {
    public boolean stringE(String str) {
        if (str.isEmpty()) return false;

        var count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        if (count == 0) return false;


        return (count < 4);
    }

    public boolean stringET(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
            // alternative: str.substring(i, i+1).equals("e")
        }

        return (count >= 1 && count <= 3);
    }
}
