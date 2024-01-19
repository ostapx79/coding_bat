package edu.coding_bat.logic_1.in_order_equal;

public class InOrderEqual {
    /*
    Given three ints, a b c, return true if they are in
    strict increasing order, such as 2 5 11, or 5 6 7,
    but not 6 5 7 or 5 5 7. However, with the exception
    that if "equalOk" is true, equality is allowed,
    such as 5 5 7 or 5 5 5.
    Учитывая три целых числа, a b c, возвращайте true, если
    они находятся в строгом порядке возрастания, например 2 5 11
    или 5 6 7, но не 6 5 7 или 5 5 7. Однако, за исключением того,
    что если «equalOk» истинно, допускается равенство,
    например 5 5 7 или 5 5 5.
     */

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (a > b || b > c && equalOk) return false;
        if (a < b && b < c || equalOk) return true;
        return false;
    }
}
