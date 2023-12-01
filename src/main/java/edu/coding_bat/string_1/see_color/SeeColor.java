package edu.coding_bat.string_1.see_color;

public class SeeColor {
    /*
    Given a string, if the string begins
    with "red" or "blue" return that color
    string, otherwise return the empty string.
    Учитывая строку, если строка начинается
    с «красного» или «синего», верните строку
    этого цвета, в противном случае верните
    пустую строку.
     */

    public String seeColor(String str) {
        if (str.startsWith("red")) return "red";
        else if (str.startsWith("blue")) return "blue";
        return "";
    }
}
