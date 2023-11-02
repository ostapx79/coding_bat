package edu.coding_bat.warmup_1.makes10;

public class Makes10 {
    public boolean makes10(int a, int b) {
        final int TEN = 10;
        int sum = a + b;
        return a == TEN || b == TEN || sum == TEN;
    }
}
