package codewars;

import java.util.Scanner;

public class BitCounter {
    public static int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите неотрицательное целое число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Ошибка: число должно быть неотрицательным.");
        } else {
            int result = countBits(number);
            System.out.println("Количество битов, равных 1, в двоичном представлении числа " + number + " равно: " + result);
        }
        scanner.close();
    }
}
