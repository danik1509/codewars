package codewars;

import java.util.Scanner;

public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) {
            throw new IllegalArgumentException("Массив должен содержать 10 целых чисел.");
        }
        return String.format("(%d%d%d) %d%d%d-%d%d-%d%d",
                numbers[0], numbers[1], numbers[2],
                numbers[3], numbers[4], numbers[5],
                numbers[6], numbers[7],
                numbers[8], numbers[9]
        );
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Введите 10 целых чисел (от 0 до 9) для номера телефона:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Число %d: ", i + 1);
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0 || numbers[i] > 9) {
                System.out.println("Ошибка: число должно быть от 0 до 9.");
                i--;
            }
        }
        String phoneNumber = createPhoneNumber(numbers);
        System.out.println("Сформированный номер телефона: " + phoneNumber);
        scanner.close();
    }
}
