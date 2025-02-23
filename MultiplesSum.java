package codewars;

import java.util.Scanner;

public class MultiplesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int number = scanner.nextInt();
        int result = sumOfMultiples(number);
        System.out.println("Сумма всех кратных 3 или 5 ниже " + number + " равна: " + result);
        scanner.close();
    }
    public static int sumOfMultiples(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
