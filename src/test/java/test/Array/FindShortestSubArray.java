package test.Array;

import org.junit.jupiter.api.Test;

import java.util.*;

public class FindShortestSubArray {
    // ToDo
    // https://leetcode.com/problems/degree-of-an-array/
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> found = new HashMap<>();
        HashMap<Integer, Integer> results = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(results.containsKey(nums[i]))
                continue;
            if (found.containsKey(nums[i])) {
                int end = i;
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] == nums[i]) {
                        end = j;
                        break;
                    }
                }

                int range = end - found.get(nums[i]) + 1;
                results.put(nums[i], range);
            } else {
                found.put(nums[i], i);
            }
        }


        if(results.isEmpty())
            return 1;

        return Collections.min(results.values());
    }

    @Test
    void name1() {
        int[] nums = new int[] {1};
        System.out.println(findShortestSubArray(nums));
    }

    @Test
    void name2() {
        int[] nums = new int[] {1,2,2,3,1};
        System.out.println(findShortestSubArray(nums));
    }

    @Test
    void name3() {
        int[] nums = new int[] {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }

    @Test
    void name4() {
        int[] nums = new int[] {1,1,1,2,2,2,1};
        System.out.println(findShortestSubArray(nums));
    }

    @Test
    void name5() {
        int[] nums = new int[] {1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }
}
