package test.Math;

public class FactorialFind {
    public int factorial(int src) {
        int result = 1;
        for (int i = 2; i <= src; i++) {
            result *= i;
        }
        return result;
    }

    public int fact(int src) {
        if (src == 1) return 1;

        return src * fact(src - 1);
    }
}
