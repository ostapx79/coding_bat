package edu.coding_bat.warmup_1.parrot_trouble;

public class ParrotTrouble {
    public boolean parrotTrouble(boolean talking, int hour) {

        // Example 1
        // if (talking && (hour >= 0 && hour <= 6)) return true;
        // else if (talking && (hour >= 21 && hour <= 23)) return true;
        // else return false;

        // Example 2
        // if ((talking && (hour >= 0 && hour <= 6)) || (talking && (hour >= 21 && hour <= 23))) return true;

        // Example 3
        return ((talking && (hour >= 0 && hour <= 6)) || (talking && (hour >= 21 && hour <= 23)));
    }
}
