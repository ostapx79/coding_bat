package edu.coding_bat.logic_1.two_as_one;

public class TwoAsOne {
    /*
    Given three ints, a b c, return true if it is
    possible to add two of the ints to get the third.
    Учитывая три целых числа, a b c, верните true, если
    можно сложить два целых числа, чтобы получить третье.
     */

    public boolean twoAsOne(int a, int b, int c) {
        int res = 0;
        if ((a == 0 || b == 0 || c == 0) && (a == b || b == c || a == c)) {
            return true;
        }
        if (a > b && a > c) {
            res = Math.abs(b) + Math.abs(c);
            return res == a;
        } else if (b > a && b > c) {
            res = Math.abs(a) + Math.abs(c);
            return res == b;
        } else if (c > a && c > b) {
            res = Math.abs(a) + Math.abs(b);
            return res == c;
        }
        return false;
    }
}
