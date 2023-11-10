package edu.coding_bat.warmup_1.max_1020;

public class Max1020 {
    /*
    Учитывая два положительных целочисленных значения,
    верните большее значение, находящееся в диапазоне
    от 10 до 20 включительно, или верните 0, если ни одно
    из них не находится в этом диапазоне.
     */

    public int max1020(int a, int b) {
        if (a < 10 || b < 10) {
            if (a > 20 || b > 20) return 0;
        }

        if (a > b) {
            if (a > 9 && a < 21) return a;
            else return b;
        } else if (b > a) {
            if (b > 9 && b < 21) return b;
            else return a;
        }
        return 0;
    }

    public int max1020T(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;

        return 0;
    }
}
