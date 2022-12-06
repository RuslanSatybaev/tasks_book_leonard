package part1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        String name = "Ruslanasarl";
        System.out.println(duplicateCharacters(name));
        System.out.println(duplicateSecondCharacters(name));
    }

    private static Map<Character, Integer> duplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> v == null ? 1 : ++v);
        }
        return result;
    }
    private static Map<Character, Long> duplicateSecondCharacters(String str) {
        Map<Character, Long> result = str
                .chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        return result;
    }
}
