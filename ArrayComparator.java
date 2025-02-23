package codewars;

public class ArrayComparator {
    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        boolean result = comp(a, b);
        System.out.println(result);
    }
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        int[] squaredA = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            squaredA[i] = a[i] * a[i];
        }
        sort(squaredA);
        sort(b);
        for (int i = 0; i < squaredA.length; i++) {
            if (squaredA[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
    private static void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
