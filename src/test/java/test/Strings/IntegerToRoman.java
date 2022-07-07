package test.Strings;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {
    //https://leetcode.com/problems/integer-to-roman/
    // TODO
    static Map<Character, Integer> roman;
    StringBuilder result = new StringBuilder();

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

    public String intToRoman(int num) {
        while (num >= 0) {
            if(num > 1000)
                num = addM(num);
            if(num < 1000 && num > 500)
                num = addCM(num);
        }

        return result.toString();
    }

    int addM(int num) {
        if (num >= 1000) {
            result.append('M');
            return addM(num - 1000);
        }
        return num;
    }
    int addCM(int num) {
        if(num < 1000 && num > 500) {
            result.append('C');
            return addCM(num - 100);
        }
        result.append('M');
        return num;
    }

    @Test
    void name() {
        System.out.println(intToRoman(1900));
    }
}
