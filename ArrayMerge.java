package codewars;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 2, 3, 5, 7, 8};
        int n = 2;
        int[] result = mergeArray(arr, n);
        printArray(result);
    }
    public static int[] mergeArray(int[] arr, int n) {
        for (int i = 0; i < n && arr.length > 1; i++) {
            arr = mergeOnce(arr);
        }
        return arr;
    }
    private static int[] mergeOnce(int[] arr) {
        int mid = arr.length / 2;
        int leftSize = mid;
        int rightSize = arr.length - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < leftSize; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < rightSize; i++) {
            right[i] = arr[mid + i];
        }
        int maxLength = Math.max(left.length, right.length);
        int[] merged = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            if (i < left.length) {
                merged[i] += left[i];
            }
            if (i < right.length) {
                merged[i] += right[i];
            }
        }
        return merged;
    }
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}