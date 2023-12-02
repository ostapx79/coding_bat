package edu.coding_bat.string_1.without2;

public class Without2 {
    /*
    Given a string, if a length 2 substring appears
    at both its beginning and end, return a string
    without the substring at the beginning, so "HelloHe"
    yields "lloHe". The substring may overlap with itself,
    so "Hi" yields "". Otherwise, return the original
    string unchanged.
    Учитывая строку, если подстрока длиной 2 появляется
    как в ее начале, так и в конце, верните строку без
    подстроки в начале, поэтому «HelloHe» дает «lloHe».
    Подстрока может перекрываться сама с собой, поэтому
    "Hi" дает "". В противном случае верните исходную
    строку без изменений.
     */

    public String without2(String str) {
        if (str.isEmpty()) return "";
        else if (str.length() < 2) return str;
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) {
            return str.substring(2);
        }
        return str;
    }
}
