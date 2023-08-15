package com.example;

public class MathUtil {
    static int mdc(int a, int b) {
        if (b > 0 && a % b == 0) {
            return b;
        }
        return 0;
    }
}
