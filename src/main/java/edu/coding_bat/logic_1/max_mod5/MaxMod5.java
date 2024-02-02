package edu.coding_bat.logic_1.max_mod5;

public class MaxMod5 {
    /*
    Given two int values, return whichever value is larger.
    However if the two values have the same remainder when divided
    by 5, then the return the smaller value. However, in all cases,
    if the two values are the same, return 0. Note: the % "mod" operator
    computes the remainder, e.g. 7 % 5 is 2.
    Учитывая два целочисленных значения, верните то значение, которое больше.
    Однако если два значения имеют одинаковый остаток при делении на 5, то
    возвращается меньшее значение. Однако во всех случаях, если два значения
    одинаковы, возвращайте 0. Примечание: оператор % «mod» вычисляет остаток,
    например 7 % 5 равно 2.
     */

    public int maxMod5(int a, int b) {
        // a > b = max
        // (a % 5 == 0) == (b % 5 == 0) -> min
        // a == b -> 0
        int res = Math.max(a, b);

        if ((a % 5 == 0) && (b % 5 == 0)) {
            return Math.min(a, b);
        }

        if (a == b) res = 0;

        return res;
    }
}
