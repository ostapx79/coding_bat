package edu.coding_bat.string_1.middle_two;

public class MiddleTwo {
    /*
    Given a string of even length,
    return a string made of the middle
    two chars, so the string "string" yields
    "ri". The string length will be at least 2.
    Учитывая строку четной длины, верните
    строку, состоящую из двух средних символов,
    чтобы строка «строка» давала «ri».
    Длина строки будет не менее 2.
     */

    public String middleTwo(String str) {
        return str.substring(str.length() / 2 - 1, str.length() / 2 + 1);
    }
}
