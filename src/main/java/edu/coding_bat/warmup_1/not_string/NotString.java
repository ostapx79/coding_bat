package edu.coding_bat.warmup_1.not_string;

public class NotString {
    public String notString(String str) {
//        if (str.contains("not") && str.indexOf("not") == 0) return str;
//        return "not " + str;
        return (str.contains("not") && str.indexOf("not") == 0) ? str : "not " + str;
    }
}
