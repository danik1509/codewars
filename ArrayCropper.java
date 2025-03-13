package codewars;

public class ArrayCropper {
    public static int[][] cropArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int minRow = rows, maxRow = -1, minCol = cols, maxCol = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == 1) {
                    if (i < minRow) minRow = i;
                    if (i > maxRow) maxRow = i;
                    if (j < minCol) minCol = j;
                    if (j > maxCol) maxCol = j;
                }
            }
        }
        if (maxRow == -1) {
            return new int[0][0];
        }
        int croppedRows = maxRow - minRow + 1;
        int croppedCols = maxCol - minCol + 1;
        int[][] croppedArray = new int[croppedRows][croppedCols];
        for (int i = minRow; i <= maxRow; i++) {
            for (int j = minCol; j <= maxCol; j++) {
                croppedArray[i - minRow][j - minCol] = array[i][j];
            }
        }
        return croppedArray;
    }
    public static void main(String[] args) {
        int[][] array = {
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {1, 1, 1, 0},
                {0, 0, 0, 0}
        };
        int[][] cropped = cropArray(array);
        for (int[] row : cropped) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
