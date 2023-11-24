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
        for (int i = 0; i < (num.length - 2); i++) {
            var val = num[i];
            if (num[i + 1] == (val + 5) &&
                    Math.abs(num[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
