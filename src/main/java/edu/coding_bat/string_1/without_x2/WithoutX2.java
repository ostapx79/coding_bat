package edu.coding_bat.string_1.without_x2;

public class WithoutX2 {
    /*
    Given a string, if one or both of
    the first 2 chars is 'x', return
    the string without those 'x' chars,
    and otherwise return the string unchanged.
    his is a little harder than it looks.
    Учитывая строку, если один или оба первых двух символа
    равны «x», верните строку без этих символов «x», а
    в противном случае верните строку без изменений.
    Это немного сложнее, чем кажется.
     */
    public String withoutX2(String str) {
        if (str.isEmpty()) return str;
        if (str.equals("xx") && str.length() < 3) return "";
        if (str.length() > 2 && str.substring(0, 2).equals("xx")) return str.replace("xx", "");
        if (str.substring(0, 1).equals("x")) {
            return str.substring(1);
        } else if (str.substring(1, 2).equals("x")) {
            return str.substring(0, 1) + str.substring(str.length() - 1);
        }
        return str;
    }
}
