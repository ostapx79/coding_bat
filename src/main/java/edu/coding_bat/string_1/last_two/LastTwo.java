package edu.coding_bat.string_1.last_two;

public class LastTwo {
    /*
    Given a string of any length, return a new string
    where the last 2 chars, if present, are swapped,
    so "coding" yields "codign".
    Учитывая строку любой длины, верните новую строку,
    в которой последние два символа, если они присутствуют,
    поменяны местами, поэтому «кодирование» дает «codign».
     */

    public String lastTwo(String str) {
        if (str.isEmpty() || str.length() == 1) return str;
        else if (str.length() < 3) return str.substring(str.length() - 1) + str.charAt(0);
        return str.substring(0, str.length() - 2)
                + str.substring(str.length() - 1)
                + str.charAt(str.length() - 2);
    }
}
