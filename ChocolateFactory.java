package codewars;

import java.util.Scanner;

public class ChocolateFactory {
    public static int chocolate(int N, int[] firstBar, int[] secondBar) {
        int[] position = new int[N + 1];
        for (int i = 0; i < N; i++) {
            position[secondBar[i]] = i;
        }
        int[] transformed = new int[N];
        for (int i = 0; i < N; i++) {
            transformed[i] = position[firstBar[i]];
        }
        int lisLength = findLIS(transformed);
        return N - lisLength;
    }
    private static int findLIS(int[] arr) {
        int[] lis = new int[arr.length];
        int length = 0;
        for (int num : arr) {
            int pos = binarySearch(lis, length, num);
            lis[pos] = num;
            if (pos == length) {
                length++;
            }
        }
        return length;
    }
    private static int binarySearch(int[] lis, int length, int value) {
        int left = 0, right = length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (lis[mid] < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер шоколадной плитки (N): ");
        int N = scanner.nextInt();
        int[] firstBar = new int[N];
        int[] secondBar = new int[N];
        System.out.println("Введите портреты для первой плитки (числа от 1 до " + N + "):");
        for (int i = 0; i < N; i++) {
            firstBar[i] = scanner.nextInt();
            if (firstBar[i] < 1 || firstBar[i] > N) {
                System.out.println("Недопустимое число! Пожалуйста, введите числа от 1 до " + N + ".");
                i--;
            }
        }
        System.out.println("Введите портреты для второй плитки (числа от 1 до " + N + "):");
        for (int i = 0; i < N; i++) {
            secondBar[i] = scanner.nextInt();
            if (secondBar[i] < 1 || secondBar[i] > N) {
                System.out.println("Недопустимое число! Пожалуйста, введите числа от 1 до " + N + ".");
                i--;
            }
        }
        int result = chocolate(N, firstBar, secondBar);
        System.out.println("Минимальное количество разрывов: " + result);
        scanner.close();
    }
}
