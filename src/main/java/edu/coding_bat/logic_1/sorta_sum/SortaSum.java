package edu.coding_bat.logic_1.sorta_sum;

public class SortaSum {
    /*
    Given 2 ints, a and b, return their sum.
    However, sums in the range 10..19 inclusive,
    are forbidden, so in that case just return 20.
    Учитывая два целых числа, a и b, верните их сумму
    Однако суммы в диапазоне 10..19 включительно
    запрещены, поэтому в этом случае просто верните 20.
     */

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }
}
