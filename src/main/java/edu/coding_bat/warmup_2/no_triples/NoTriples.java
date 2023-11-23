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
        if (num.length < 3) return true;

        for (int i = 0; i < (num.length - 2); i++) {
            if (num[i] == 1 && num[i + 1] == 1 && num[i + 2] == 1) return false;
            if (num[i] == 2 && num[i + 1] == 2 && num[i + 2] == 2) return false;
        }

        return true;
    }

    public boolean noTriplesT(int[] nums) {
        // Iterate < length-2, so can use i+1 and i+2 in the loop.
        // Return false immediately if every seeing a triple.
        for (int i=0; i < (nums.length-2); i++) {
            int first = nums[i];
            if (nums[i+1]==first && nums[i+2]==first) return false;
        }
        // If we get here ... no triples.
        return true;
    }
}
