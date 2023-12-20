package edu.coding_bat.logic_1.teen_sum;

public class TeenSum {
    /*
    Given 2 int s, a and b, return their sum. However,
    "teen" values in the range 13..19 inclusive, are
    extra lucky. So if either value is a teen,
    just return 19.
    Учитывая два целых числа, a и b, верните их сумму.
    Однако «подростковым» значениям в диапазоне 13..19
    включительно повезло больше. Поэтому, если какое-либо
    из значений соответствует подростку, просто верните 19.
     */

    public int teenSum(int a, int b) {
        int sum = a + b;
        if ((a < 13 || b < 13) && (a > 19 || b > 19)) return sum;
        if (sum > 13 && sum < 19) return 19;
        // if (a > 19 && b > 19) return sum;
        return sum;
    }
}
