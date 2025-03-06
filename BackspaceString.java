package codewars;

import java.util.Scanner;

public class BackspaceString {
    public static String processString(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (c == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        String processedString = processString(input);
        System.out.println("Обработанная строка: " + processedString);
        scanner.close();
    }
}
