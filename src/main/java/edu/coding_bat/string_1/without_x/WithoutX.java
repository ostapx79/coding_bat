package edu.coding_bat.string_1.without_x;

public class WithoutX {
    /*
    Given a string, if the first or last
    chars are 'x', return the string without
    those 'x' chars, and otherwise return
    the string unchanged.
    Учитывая строку, если первый или последний
    символ равен «x», верните строку без этих
    символов «x», в противном случае верните
    строку без изменений.
     */

    public String withoutX(String str) {
        if (str.isEmpty() || (str.length() == 1 && str.equals("x"))) return "";
        if (str.substring(0, 1).equals("x") && str.substring(str.length() - 1).equals("x")) {
            return str.substring(1, str.length() - 1);
        } else if (str.substring(0, 1).equals("x")) {
            return str.substring(1);
        } else if (str.substring(str.length() - 1).equals("x")) {
            return str.substring(0, str.length() - 1);
        }

        return str;
    }
}
