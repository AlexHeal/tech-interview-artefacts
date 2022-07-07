package test.Strings;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {
    /*
    найти строки содержащие одинаковый набор символов и вывести на консоль в виде:
    набор символов(в любом порядке) = индексы строк в исходном массиве через запятую(в любом порядке)
    Пример:
    подаём на вход: {"qwe","wqe","qwe","a","a"};
    вывод на консоль: a = 3, 4 eqw = 0, 1
     */
    public void containsAnagrams(String[] src) {
        HashMap<String, List<Integer>> found = new HashMap<>();

        for (int i = 0; i < src.length; i++) {
            String sorted = arrSort(src[i]);

            if (found.containsKey(sorted)) {
                List<Integer> temp = new ArrayList<>(found.get(sorted));
                temp.add(i);
                found.put(sorted, temp);
            } else {
                found.put(sorted, new ArrayList<>(List.of(i)));
            }
        }

        found.forEach((s, l) -> {
            if (l.size() > 1) System.out.println(s + " = " + l);
        });
    }

    String arrSort(String src) {
        char[] arr = src.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    @Test
    void name() {
        String[] arr = new String[]{"qwe", "wqe", "qwee", "a", "a"};
        containsAnagrams(arr);
    }
}

