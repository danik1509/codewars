package codewars;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите числа (разделенные пробелами):");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int result = findOdd(array);
        if (result == 0){
            System.out.println("Нет чисел, которые встречаются нечётное кол-во раз");
        }
        else {
            System.out.println("Число, которое встречается нечетное количество раз: " + result);
        }
        scanner.close();
    }
    public static int findOdd(int[] array) {
        int result = 0;
        for (int num : array) {
            result ^= num;
        }
        return result;
    }
}
