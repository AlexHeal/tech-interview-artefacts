package test.Strings;

import org.junit.jupiter.api.Test;

public class LongestCommonPrefix {
    // https://leetcode.com/problems/longest-common-prefix/
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (!strs[i].startsWith(pre))
                pre = pre.substring(0, pre.length() - 1);
        return pre;
    }

    @Test
    void name() {
        String[] arr2 = {"flower", "flow", "flight"};

        System.out.println(longestCommonPrefix(arr2));
    }
}
