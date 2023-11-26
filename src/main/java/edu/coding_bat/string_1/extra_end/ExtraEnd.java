package edu.coding_bat.string_1.extra_end;

public class ExtraEnd {
    /*
    Given a string, return a new string made
    of 3 copies of the last 2 chars of the
    original string. The string length will
    be at least 2.
    Учитывая строку, верните новую строку,
    состоящую из трех копий последних двух
    символов исходной строки. Длина строки
    будет не менее 2.
     */
    public String extraEnd(String str) {
        var resStr = str.substring(str.length() - 2);

        return resStr + resStr + resStr;
    }
}
