package test.Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    // https://leetcode.com/problems/two-sum
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target)
                    return new int[]{i, j};
            }
        }
        return new int[0];
    }

    public int[] twoSumHashSet(int[] nums, int target) {
        HashMap<Integer, Integer> finded = new HashMap<>();
        int index = 0;
        for (int i : nums) {
            int key = target - i;
            if (finded.containsKey(key)) {
                int j = finded.get(key);
                return new int[] {index, j};
            } else {
                finded.put(i, index);
            }
            index++;
        }
        return new int[0];
    }

    @Test
    void name() {
        int[] arr = new int[]{2, 7, 11, 15, 12, 12, 55, 66, 77, 88, 99, 838};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
        int[] arr2 = new int[]{2, 3, 4};
        System.out.println(Arrays.toString(twoSum(arr2, 6)));
        int[] arr3 = new int[]{3, 3};
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
    }
    @Test
    void hashSet() {
        int[] arr = new int[]{2, 7, 11, 15, 12, 12, 55, 66, 77, 88, 99, 838};
        System.out.println(Arrays.toString(twoSumHashSet(arr, 9)));
        int[] arr2 = new int[]{2, 3, 4};
        System.out.println(Arrays.toString(twoSumHashSet(arr2, 6)));
        int[] arr3 = new int[]{3, 3};
        System.out.println(Arrays.toString(twoSumHashSet(arr3, 6)));
    }
}
