package part1;

public class OnlyDigits {
    public static void main(String[] args) {

        String number = "123456789123456789123456789123456789lytytyty";
        long startTime = System.currentTimeMillis();
        System.out.println(containsOnlyDigits(number));
        long endTime = System.currentTimeMillis();
        System.out.println("That took " + (endTime - startTime) + " milliseconds");

        long startTime1 = System.currentTimeMillis();
        System.out.println(containsSecondOnlyDigits(number));
        long endTime1 = System.currentTimeMillis();
        System.out.println("That took " + (endTime1 - startTime1) + " milliseconds");

    }

    private static boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsSecondOnlyDigits(String str) {
        return str.chars().allMatch(Character::isDigit);
    }
}
