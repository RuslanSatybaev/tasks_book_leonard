package part1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate12 {
    public static void main(String[] args) {
        System.out.println(removeDuplicates3("russsllan"));
    }

    private static String removeDuplicates1(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private static String removeDuplicates2(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Set<Character> chHashSet = new HashSet<>();
        for (char c : chArray) {
            if (chHashSet.add(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    private static String removeDuplicates3(String str){
        return Arrays.stream(str.split(""))
                .distinct()
                .collect(Collectors.joining());
    }
}
