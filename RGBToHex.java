package codewars;

import java.util.Scanner;

public class RGBToHex {

    public static String rgb(int r, int g, int b) {
        r = clamp(r);
        g = clamp(g);
        b = clamp(b);
        return String.format("%02X%02X%02X", r, g, b);
    }

    private static int clamp(int value) {
        if (value < 0) {
            return 0;
        } else if (value > 255) {
            return 255;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение R (0-255): ");
        int r = scanner.nextInt();

        System.out.print("Введите значение G (0-255): ");
        int g = scanner.nextInt();

        System.out.print("Введите значение B (0-255): ");
        int b = scanner.nextInt();

        String hexColor = rgb(r, g, b);
        System.out.println("RGB в шестнадцатеричном формате: " + hexColor);

        scanner.close();
    }
}