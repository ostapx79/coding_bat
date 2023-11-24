package edu.coding_bat.warmup_2.has_271;

public class Has271 {
    public boolean has271(int[] num) {
        /*
        Учитывая массив целых чисел, верните true,
        если он содержит шаблон 2, 7, 1: значение,
        за которым следует значение плюс 5,
        за которым следует значение минус 1.
        Кроме того, 271 учитывается, даже если «1»
        отличается на 2 или меньше правильного значения.
         */
        for (int i = 0; i < num.length - 2; i++) {
            if (num[i] == 2 && num[i + 1] == 7 && num[i + 2] == 1) return true;
        }
        return false;
    }
}
