package codewars;

import java.util.Scanner;

public class MultiplicationTable {
    public static int[][] createMultiplicationTable(int size) {
        int[][] table = new int[size][size];
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        return table;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер таблицы умножения (N): ");
        int size = scanner.nextInt();
        int[][] multiplicationTable = createMultiplicationTable(size);
        for (int[] row : multiplicationTable) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}