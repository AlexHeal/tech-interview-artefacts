package test.Array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] snapArr = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);

        int l = 0, r = nums.length - 1;
        int sum;
        while (l < r) {
            sum = nums[l] + nums[r];
            if (sum == target) {
                return new int[]{l, r};
            }
            if (sum < target) {
                l++;
            } else {
                r--;
            }
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
}
