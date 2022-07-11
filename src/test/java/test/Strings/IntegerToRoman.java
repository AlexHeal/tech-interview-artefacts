package test.Strings;

import org.junit.jupiter.api.Test;

public class IntegerToRoman {
    //https://leetcode.com/problems/integer-to-roman/
    StringBuilder result = new StringBuilder();

    public String intToRoman(int num) {
        while (num > 0) {
            if (num >= 1000)
                num = addM(num);
            if (num >= 900 && num < 1000) {
                num = num - 900;
                result.append("CM");
            }
            if (num >= 500 && num <= 900)
                num = addD(num);
            if (num >= 400 && num < 500) {
                num = num - 400;
                result.append("CD");
            }
            if (num >= 100 && num <= 400) {
                num = addC(num);
            }
            if (num >= 90 && num < 100) {
                num = num - 90;
                result.append("XC");
            }
            if (num >= 50 && num < 90)
                num = addL(num);
            if (num >= 40 && num < 50) {
                num = num - 40;
                result.append("XL");
            }
            if (num >= 10 && num < 40)
                num = addX(num);
            if (num == 9) {
                num = 0;
                result.append("IX");
            }
            if (num >= 5 && num < 9)
                num = addV(num);
            if (num == 4) {
                num = 0;
                result.append("IV");
            }
            if (num <= 3 && num >= 1)
                num = addI(num);
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

    int addD(int num) {
        if (num >= 500) {
            result.append('D');
            return addD(num - 500);
        }
        return num;
    }

    int addC(int num) {
        if (num >= 100) {
            result.append('C');
            return addC(num - 100);
        }
        return num;
    }

    int addL(int num) {
        if (num >= 50) {
            result.append('L');
            return addL(num - 50);
        }
        return num;
    }

    int addX(int num) {
        if (num >= 10) {
            result.append('X');
            return addX(num - 10);
        }
        return num;
    }

    int addV(int num) {
        if (num >= 5) {
            result.append('V');
            return addV(num - 5);
        }
        return num;
    }

    int addI(int num) {
        if (num >= 1) {
            result.append('I');
            return addI(num - 1);
        }
        return num;
    }

    @Test
    void name1() {
        System.out.println(intToRoman(3));
    }

    @Test
    void name2() {
        System.out.println(intToRoman(58));
    }

    @Test
    void name3() {
        System.out.println(intToRoman(1994));
    }

    @Test
    void name4() {
        System.out.println(intToRoman(1000));
    }
}
