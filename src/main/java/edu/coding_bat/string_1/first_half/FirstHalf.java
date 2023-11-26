package edu.coding_bat.string_1.first_half;

public class FirstHalf {
    /*
    Given a string of even length, return the
    first half. So the string "WooHoo" yields "Woo".
    Учитывая строку четной длины, верните первую
    половину. Таким образом, строка «WooHoo» дает «Woo».
     */

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }
}
