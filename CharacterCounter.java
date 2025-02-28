package codewars;

import java.util.Scanner;

public class CharacterCounter {
    public static int[] countCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return new int[0];
        }
        int[] counts = new int[256];
        for (char c : str.toCharArray()) {
            counts[c]++;
        }
        return counts;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для подсчета символов: ");
        String input = scanner.nextLine();
        printCounts(input);
        scanner.close();
    }
    private static void printCounts(String str) {
        int[] counts = countCharacters(str);
        if (counts.length == 0) {
            System.out.println("{}");
            return;
        }
        System.out.print("{");
        boolean first = true;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print((char) i + ": " + counts[i]);
                first = false;
            }
        }
        System.out.println("}");
    }
}
