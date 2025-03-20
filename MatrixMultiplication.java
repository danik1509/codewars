package codewars;

public class MatrixMultiplication {

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int n = A.length;
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
                {1, 2},
                {3, 2}
        };
        int[][] B = {
                {3, 2},
                {1, 1}
        };
        int[][] C = multiplyMatrices(A, B);
        System.out.println("Resultant Matrix C:");
        printMatrix(C);
    }
}
