package edu.coding_bat.warmup_1.del_del;

public class DelDel {
    public String delDel(String str) {
        if ("del".equals(str)) return str;

        if (str.indexOf("del") < 2) {
            return str.replace("del", "");
        }

        return str;
    }

    public String delDelT(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }

        return str;
    }
}
