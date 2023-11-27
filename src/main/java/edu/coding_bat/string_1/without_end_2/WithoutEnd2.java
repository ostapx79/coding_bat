package edu.coding_bat.string_1.without_end_2;

public class WithoutEnd2 {
    /*
    Given a string, return a version without both
    the first and last char of the string. The string
    may be any length, including 0.
    Учитывая строку, верните версию без первого и
    последнего символа строки. Строка может быть
    любой длины, включая 0.
     */

    public String withoutEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length() - 1);
    }
}
