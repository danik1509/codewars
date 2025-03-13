package codewars;

import java.util.Scanner;

public class ClosestPoints {

    public static int[][] closestPoints(int[][] points, int n) {
        int length = points.length;
        int[][] distances = new int[length][2];
        for (int i = 0; i < length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            distances[i][0] = x * x + y * y;
            distances[i][1] = i;
        }
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (distances[j][0] > distances[j + 1][0]) {
                    int[] temp = distances[j];
                    distances[j] = distances[j + 1];
                    distances[j + 1] = temp;
                }
            }
        }
        int[][] closestN = new int[n][2];
        for (int i = 0; i < n; i++) {
            int index = distances[i][1];
            closestN[i][0] = points[index][0];
            closestN[i][1] = points[index][1];
        }
        return closestN;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество точек: ");
        int m = scanner.nextInt();
        int[][] pointsList = new int[m][2];
        for (int i = 0; i < m; i++) {
            System.out.print("Введите координаты точки " + (i + 1) + " (x y): ");
            pointsList[i][0] = scanner.nextInt();
            pointsList[i][1] = scanner.nextInt();
        }
        System.out.print("Введите количество ближайших точек для выбора: ");
        int n = scanner.nextInt();
        if (n > m) {
            System.out.println("Ошибка: количество ближайших точек не может превышать общее количество точек.");
            return;
        }
        int[][] closestPoints = closestPoints(pointsList, n);
        System.out.println("Ближайшие точки:");
        for (int[] point : closestPoints) {
            System.out.println("[" + point[0] + ", " + point[1] + "]");
        }
        scanner.close();
    }
}