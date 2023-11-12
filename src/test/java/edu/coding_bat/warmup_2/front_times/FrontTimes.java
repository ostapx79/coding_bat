package edu.coding_bat.warmup_2.front_times;

public class FrontTimes {
    public String frontTimes(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++) {
            if (str.length() < 3)
                res += str;
            else
                res += str.substring(0, 3);
        }
        return res;
    }

    public String frontTimesT(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }
}
