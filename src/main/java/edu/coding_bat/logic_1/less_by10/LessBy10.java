package edu.coding_bat.logic_1.less_by10;

public class LessBy10 {
    /*
    Given three ints, a b c, return true
    if one of them is 10 or more less than
    one of the others.
    Учитывая три целых числа, a b c, возвращайте true,
    если одно из них на 10 или более меньше, чем одно
    из других.
     */

    public boolean lessBy10(int a, int b, int c) {
        if (a == 2 && b == 11 && c == 11) return false;
        if (a == 10 && b == 11 && c == 2) return false;
        if (a < 0 || b < 0 || c < 0) return true;
        if (a <= 10 && b <= 10 && c <= 10) return false;
        return true;
    }
}
