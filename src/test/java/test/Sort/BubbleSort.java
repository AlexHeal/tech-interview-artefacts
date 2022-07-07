package test.Sort;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BubbleSort {
    void bubbleSort(int[] sort_arr, int len) {
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (sort_arr[j + 1] < sort_arr[j]) {
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j + 1];
                    sort_arr[j + 1] = swap;
                }
            }
        }
    }

    void bubble(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {
            for (int j = 0; j < src.length - 1 - i - 1; j++) {
                if (src[j + 1] < src[j]) {
                    int swap = src[j];
                    src[j] = src[j + 1];
                    src[j + 1] = swap;
                }
            }
        }
    }

    @Test
    public void name() {
        int[] array = {10, 5, 3, 1, 24, 12};
        int len = array.length;

//        bubbleSort(array, len);
        bubble(array);

//        System.out.print(Arrays.toString(array));
        System.out.print(Arrays.toString(array));
    }
}
