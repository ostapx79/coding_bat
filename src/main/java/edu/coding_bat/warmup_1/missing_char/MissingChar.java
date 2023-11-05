package edu.coding_bat.warmup_1.missing_char;

public class MissingChar {
    public String missingChar(String str, int index) {
<<<<<<< Updated upstream

        return str.substring(0, index) + str.substring(index + 1);
=======
        String res = str.substring(0, index) + str.substring(index + 1);
        return res;
>>>>>>> Stashed changes
    }
}
