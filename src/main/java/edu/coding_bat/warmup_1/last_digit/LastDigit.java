package edu.coding_bat.warmup_1.last_digit;

public class LastDigit {
    public boolean lastDigit(int a, int b) {

        if (a < b) {
            var resB = b % 10;
            return resB == a;
//            if (resB == a)
//                return true;
//            else
//                return false;
        } else {
            var resA = a % 10;
            return resA == b;
//            if (resA == b)
//                return true;
//            else
//                return false;
        }
    }
}
