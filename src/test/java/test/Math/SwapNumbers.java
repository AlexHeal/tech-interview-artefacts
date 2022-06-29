package test.Math;

import org.junit.jupiter.api.Test;

public class SwapNumbers {
    void swap(int a, int b) {
        a = a - b;
        b = b + a;
        a = b - a;
        System.out.println(a + " " + b);
    }

    void bitSwap(int a, int b) {
        a = a ^ b;
        b = b ^ a;
        a = b ^ a;
        System.out.println(a + " " + b);
    }

    @Test
    void name() {
        swap(1, 2);
    }

    @Test
    void name2() {
        bitSwap(1, 2);
    }
}
