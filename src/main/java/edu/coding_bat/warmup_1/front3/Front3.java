package edu.coding_bat.warmup_1.front3;

public class Front3 {
    public String front3(String str) {
        String res = "";
        final int lengthStr = str.length();

        if (str.isEmpty()) return str;

        for (int i = 0; i < 3; i++) {
            if (lengthStr == 1) res += str;
            else if (lengthStr == 2) res += str.substring(0, 2);
            else res += str.substring(0, 3);
        }

        return res;
    }

    public String front3E(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }
}
