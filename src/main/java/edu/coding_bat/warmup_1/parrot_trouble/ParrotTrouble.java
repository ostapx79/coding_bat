package edu.coding_bat.warmup_1.parrot_trouble;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour >= 0 && hour <= 6)) return true;
        if (talking && (hour >= 21 && hour <= 23)) return true;
        return false;
    }
}
