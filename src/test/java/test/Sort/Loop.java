package test.Sort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Loop {
    int[] loopSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    arr[i] = arr[i] ^ arr[j];
                    arr[j] = arr[i] ^ arr[j];
                    arr[i] = arr[j] ^ arr[i];
                }
            }
        }

        return null;
    }

    @Test
    void name() {
        int[] arr = {4, 5, 3, 2, 1, 4, 4, 5};
        int[] expected = {1, 2, 3, 4, 4, 4, 5, 5};

        assertThat(loopSort(arr)).isEqualTo(expected);
    }
}
