package edu.coding_bat.warmup_1.front_22;

public class Front22 {
    public String front22(String str) {
        if (str.isEmpty()) return str;

        if (str.length() == 1) return str + str + str;

        var front = str.substring(0, 2);

        return front + str + front;
    }

    public String front22_2(String str) {
        int take = 2;

        if (str.length() < take) {
            take = str.length();
        }

        var front = str.substring(0, take);

        return front + str + front;
    }
}
