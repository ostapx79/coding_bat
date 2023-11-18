package edu.coding_bat.warmup_2.array_front9;

public class ArrayFront9 {

    /*
    Учитывая массив целых чисел, верните true,
    если один из первых 4 элементов массива равен 9.
    Длина массива может быть меньше 4.
     */

    public boolean arrayFront9(int[] num) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == 9 && i < 4) {
                return true;
            }
        }

        return false;
    }

    public boolean arrayFront9T(int[] num) {

        int end = num.length;
        if (end > 4) end = 4;

        for (int i = 0; i < end; i++) {
            if (num[i] == 9) return true;
        }

        return false;
    }
}
