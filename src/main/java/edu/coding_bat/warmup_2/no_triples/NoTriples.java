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
        var count1 = 0;
        var count2 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1) count1++;

            if (num[i] == 2) count2++;
        }
        if (count1 > 3 && count2 > 3) return true;
        return false;
    }
}
