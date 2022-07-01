package test.Strings;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Reverse {
    String reverse(String src) {
        int size = src.length() - 1;
        char[] result = src.toCharArray();
        char tmp;
        for (int i = 0, j = size; i <= size / 2; i++, j--) {
            //if(Character.isLetter(result[i]) && Character.isLetter(result[j])) {
                tmp = result[i];
                result[i] = result[j];
                result[j] = tmp;
//            }
        }
        return new String(result);
    }

    @Test
    void reverseTest() {
        String str = "This code is exist? Why??!!";
        String expected = new StringBuilder(str).reverse().toString();

        assertThat(reverse(str)).isEqualTo(expected);
    }

    String reverseCharAt(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        return result;
    }

    @Test
    void reverseCharAtTest() {
        String str = "This code is exist? Why??!!";
        String expected = new StringBuilder(str).reverse().toString();

        assertThat(reverseCharAt(str)).isEqualTo(expected);
    }

    String reverseRec(String scr) {
        return new String(rev(scr.toCharArray(), 0, scr.length() - 1));
    }

    char[] rev(char[] arr, int a, int b) {
        if (a != arr.length / 2){
            char tmp = arr[a];
            arr[a] = arr[b];
            arr[b] = tmp;
            return rev(arr, a + 1, b - 1);
        }
        return arr;
    }

    @Test
    void reverseRec() {
        String str = "This code is exist? Why??!!";
        String expected = new StringBuilder(str).reverse().toString();

        assertThat(reverseRec(str)).isEqualTo(expected);
    }

    String reverseXOR(String src) {
        int size = src.length() - 1;
        char[] result = src.toCharArray();
        for (int i = 0, j = size; i < size / 2; i++, j--) {
            result[i] = (char) (result[i] ^ result[j]);
            result[j] =  (char) (result[i] ^ result[j]);
            result[i] =  (char) (result[i] ^ result[j]);
            // 0101
            // 1001
            // 1100
        }
        return new String(result);
    }

    @Test
    void xor() {
        String str = "This code is exist? Why??!!";
        String expected = new StringBuilder(str).reverse().toString();

        assertThat(reverseXOR(str)).isEqualTo(expected);
    }

}
