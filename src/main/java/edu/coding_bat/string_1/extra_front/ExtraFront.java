package edu.coding_bat.string_1.extra_front;

public class ExtraFront {
    /*
    Given a string, return a new string made
    of 3 copies of the first 2 chars of the original
    string. The string may be any length. If there
    are fewer than 2 chars, use whatever is there.
    Учитывая строку, верните новую строку, состоящую
    из трех копий первых двух символов исходной строки.
    Строка может быть любой длины. Если меньше дву
    символов, используйте все, что есть.
     */

    public String extraFront(String str) {
        if (str.length() < 2) return str + str + str;
        return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
    }
}
