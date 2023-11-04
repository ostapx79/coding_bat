package edu.coding_bat.warmup_1.front_back;

public class FrontBack {
    public String frontBack(String str) {
        if (str.length() == 1 || str.isEmpty()) return str;
        return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.substring(0, 1);
    }
}
