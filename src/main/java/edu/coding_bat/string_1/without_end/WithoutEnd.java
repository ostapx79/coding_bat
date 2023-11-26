package edu.coding_bat.string_1.without_end;

public class WithoutEnd {
    /*
    Given a string, return a version without the first
    and last char, so "Hello" yields "ell". The string
    length will be at least 2.
    Учитывая строку, верните версию без первого и
    последнего символа, чтобы «Hello» давало «ell».
    Длина строки будет не менее 2.
     */

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
}
