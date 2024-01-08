package edu.coding_bat.logic_1.in_order;

public class InOrder {
    /*
    Given three ints, a b c, return true if b is
    greater than a, and c is greater than b. However,
    with the exception that if "bOk" is true, b does
    not need to be greater than a.
    Учитывая три целых числа, a b c, возвращает true,
    если b больше a, а c больше b. Однако, за исключением того,
    что если «bOk» истинно, b не обязательно должно быть больше a.
     */

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (a < b && b < c || bOk) return true;
        return false;
    }
}
