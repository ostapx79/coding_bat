package edu.coding_bat.string_1.combo_string;

public class ComboString {
    /*
    Given 2 strings, a and b, return a string
    of the form short+long+short, with the shorter
    string on the outside and the longer string on
    the inside. The strings will not be the same
    length, but they may be empty (length 0).
    Учитывая две строки, a и b, верните строку вида
    short+long+short, где более короткая строка
    находится снаружи, а более длинная — внутри.
    Строки не будут одинаковой длины, но могут
    быть пустыми (длина 0).
     */

    public String comboString(String a, String b) {
        var res = "";
        if (a.length() < b.length()) res = a + b + a;
        else res = b + a + b;
        return res;
    }
}
