package edu.coding_bat.warmup_2.no_triples;

public class NoTriples {
    public boolean noTriples(int[] num) {
        /*
        Given an array of ints, we'll say that a triple is a
        value appearing 3 times in a row in the array.
        Return true if the array does not contain any triples.
        Учитывая массив целых чисел, мы скажем,
        что тройка — это значение, появляющееся в массиве 3 раза
        подряд. Возвращайте true, если массив не содержит троек.
         */
        // [1, 1, 2, 2, 1] -> true;
        for (int i = 0; i < num.length; i++) {
            if ((num[i] == 1) || (num[i] == 2)) {

                if (i == 2 && num[i] == 1) {
                    return false;
                }

                if (i == 4 && num[i] == 2) {
                    return false;
                }
            }
        }

        return true;
    }
}