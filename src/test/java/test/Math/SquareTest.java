package test.Math;

import org.junit.jupiter.api.Test;

import static java.lang.Math.abs;
import static org.assertj.core.api.Assertions.assertThat;

public class SquareTest {
    double square(double src) {
        double k = 0.01;
        int iterCount = 0;
        double sq = 0;
        while (abs((sq * sq)- src) >= k) {
            sq += 0.000001;
            iterCount++;
        }
        if(abs((sq * sq)- src) >= k) {
            return -1;
        } else {
            System.out.println("IterCount = " + iterCount);
            System.out.println("square = " + sq);
            return sq;
        }
    }

    @Test
    void name() {
        assertThat(6.42071400054357).isEqualTo(square(41.235555454233));
    }
}
