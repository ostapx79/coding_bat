package edu.coding_bat.warmup_1.start_oz;

public class StartOz {
    public String startOz(String str) {

        if (str.startsWith("oz")) return str.substring(0, 2);
        else if (str.startsWith("o")) return str.substring(0, 1);
        else if (str.startsWith("z", 1)) return str.substring(1, 2);
        else str = "";
        return str;
    }
}
