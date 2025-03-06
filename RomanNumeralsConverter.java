package codewars;

import java.util.Scanner;

public class RomanNumeralsConverter {
    public static String intToRoman(int num) {
        String[] symbols = {
                "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = {
                1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1
        };
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число от 1 до 3999: ");
        int input = scanner.nextInt();
        if (input < 1 || input > 3999) {
            System.out.println("Число должно быть в диапазоне от 1 до 3999.");
        } else {
            String romanNumeral = intToRoman(input);
            System.out.println("Римская цифра для " + input + " - это: " + romanNumeral);
        }
        scanner.close();
    }
}
