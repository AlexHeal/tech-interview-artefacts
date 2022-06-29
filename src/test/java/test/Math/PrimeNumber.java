package test.Math;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeNumber {
    List<Integer> primeNumbers(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(2);
        boolean isPrime;

        for (int i = 3; i <= n - 1; i += 2) {
            isPrime = true;
            for (int j = 3; j < i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                result.add(i);
        }

        return result;
    }

    @Test
    void name() {
        List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        assertThat(expected).isEqualTo((primeNumbers(100)));
    }
}
