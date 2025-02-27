package codewars;

import java.util.Scanner;

public class UniqueNumber {
    public static double findUniq(double[] arr) {
        if (arr[0] != arr[1]) {
            return arr[0] == arr[2] ? arr[1] : arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        double[] arr = new double[size];
        System.out.println("Введите " + size + " элементов массива, разделенных пробелом:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextDouble();
        }
        double uniqueNumber = findUniq(arr);
        System.out.println("Уникальное число: " + uniqueNumber);
        scanner.close();
    }
}
