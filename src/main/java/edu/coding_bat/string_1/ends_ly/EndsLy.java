package edu.coding_bat.string_1.ends_ly;

public class EndsLy {
    /*
    Given a string, return true if it ends in "ly".
    Учитывая строку, верните true, если она заканчивается на «ly».
     */

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        return (str.endsWith("ly"));
    }
}
