package edu.coding_bat.warmup_1.missing_char;

public class MissingChar {
    public String missingChar(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }
}
