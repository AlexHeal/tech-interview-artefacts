package test.Sort;

import java.util.List;

public class Merge {
    List<Integer> mergeSort(int[] arr) {
        int deep = 0;
        int part = arr.length;
        int size = arr.length - 1;
        while (part != 2) {
            deep++;
            part /= 2;
        }
//        for (int i = 0; i <= deep; i++) {
            for (int j = 0; j <= size; j++) {
                if (arr[j] < arr[j + 1]) {
                    swap(arr[j], arr[j + 1]);
                }
            }
//        }


        return null;
    }

    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
