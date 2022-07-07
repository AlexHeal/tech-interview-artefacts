package test.Math;

import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;
import static org.assertj.core.api.Assertions.assertThat;

public class BinarySquareTest {
    double square(double src) {
        double k = 0.01;
        int iterCount = 0;
        double low = 0;
        double height = src;
        double mid = (low + height) / 2.0;

        while (abs((mid * mid) - src) >= k) {
            if ((mid * mid) < src) {
                low = mid;
            } else {
                height = mid;
            }
            mid = (low + height) / 2.0;
            iterCount++;
        }
        System.out.println("IterCount = " + iterCount);
        System.out.println("square = " + mid);
        return mid;
    }

    @Test
    void name() {
        assertThat(6.421662581877166).isEqualTo(square(41.235555454233));
    }
}
