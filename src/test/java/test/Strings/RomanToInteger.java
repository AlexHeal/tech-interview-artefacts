package test.Strings;


import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class RomanToInteger {
    // https://leetcode.com/problems/roman-to-integer/
    static Map<Character, Integer> roman;

    static {
        roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int romanToInt(String s) {
        int sum = 0;
        boolean isTempSum = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) {
                if (isTempSum)
                    sum -= roman.get(s.charAt(i));
                else
                    sum += roman.get(s.charAt(i));
                return sum;
            } else if (roman.get(s.charAt(i)) == roman.get(s.charAt(i - 1))) {
                if (isTempSum)
                    sum -= roman.get(s.charAt(i));
                else
                    sum += roman.get(s.charAt(i));
            } else if (roman.get(s.charAt(i)) < roman.get(s.charAt(i - 1))) {
                if (isTempSum) {
                    sum -= roman.get(s.charAt(i));
                } else
                    sum += roman.get(s.charAt(i));
                isTempSum = false;
            } else {
                isTempSum = true;
                sum += roman.get(s.charAt(i));
            }
        }

        return -1;
    }

    @Test
    void name() {
        assertThat(1).isEqualTo(romanToInt("I"));
        assertThat(3).isEqualTo(romanToInt("III"));
        assertThat(58).isEqualTo(romanToInt("LVIII"));
        assertThat(1994).isEqualTo(romanToInt("MCMXCIV"));
        assertThat(3999).isEqualTo(romanToInt("MMMCMXCIX"));
    }
}
