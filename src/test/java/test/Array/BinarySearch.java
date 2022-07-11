package test.Array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearch {
    int getIndex(int[] src, int value) {
        int low = 0;
        int height = src.length - 1;
        int mid = (low + height) / 2;

        while (low <= height) {
            if (value == src[mid]) {
                return mid;
            } else if (value > mid) {
                low = mid + 1;
            } else {
                height = mid - 1;
            }
            mid = (low + height) / 2;
        }

        return -1;
    }

    @Test
    void test() {
        int[] src = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertThat(4).isEqualTo(getIndex(src, 5));
        assertThat(5).isEqualTo(getIndex(src, 6));
        assertThat(6).isEqualTo(getIndex(src, 7));
        assertThat(0).isEqualTo(getIndex(src, 1));
        assertThat(9).isEqualTo(getIndex(src, 10));
        assertThat(-1).isEqualTo(getIndex(src, 11));
    }
}
