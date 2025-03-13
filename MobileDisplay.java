package codewars;

import java.util.Scanner;

public class MobileDisplay {
    public static String mobileDisplay(int n, int p) {
        if (n < 20) n = 20;
        if (p < 30) p = 30;
        int height = (n * p) / 100;
        StringBuilder display = new StringBuilder();
        display.append("*".repeat(n)).append("\n");
        for (int i = 0; i < height - 2; i++) {
            display.append("*").append(" ".repeat(n - 2)).append("*\n");
        }
        int logoPosition = (n - 10) / 2;
        display.append("*").append(" ".repeat(logoPosition - 1))
                .append("CodeWars").append(" ".repeat(n - logoPosition - 10)).append("*\n");
        for (int i = 0; i < height - 3; i++) {
            display.append("*").append(" ".repeat(n - 2)).append("*\n");
        }
        display.append("*").append("Menu").append(" ".repeat(n - 2 - 6))
                .append("Contacts").append("*\n");
        display.append("*".repeat(n)).append("\n");
        return display.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ширину (n ≥ 20): ");
        int n = scanner.nextInt();
        System.out.print("Введите процент высоты (p ≥ 30): ");
        int p = scanner.nextInt();
        System.out.println(mobileDisplay(n, p));
        scanner.close();
    }
}