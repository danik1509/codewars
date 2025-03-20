package codewars;

import java.util.Scanner;

public class ScrambleString {

    public static boolean scramble(String str1, String str2) {
        int[] charCounts = new int[26];
        for (char c : str1.toCharArray()) {
            charCounts[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            if (charCounts[c - 'a'] <= 0) {
                return false;
            }
            charCounts[c - 'a']--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку str1: ");
        String str1 = scanner.nextLine();

        System.out.print("Введите строку str2: ");
        String str2 = scanner.nextLine();

        boolean result = scramble(str1, str2);
        System.out.println("Можно ли из str1 составить str2? " + result);

        scanner.close();
    }
}
