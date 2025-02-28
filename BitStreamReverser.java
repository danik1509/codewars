package codewars;

public class BitStreamReverser {
    public static void main(String[] args) {
        int[] bits = {
                1, 1, 1, 1, 1, 1, 1, 1,
                0, 0, 0, 0, 0, 0, 0, 0,
                0, 0, 0, 0, 1, 1, 1, 1,
                1, 0, 1, 0, 1, 0, 1, 0
        };
        int[] reversedBits = reverseBitStream(bits);
        for (int bit : reversedBits) {
            System.out.print(bit);
        }
    }
    public static int[] reverseBitStream(int[] bits) {
        int segmentSize = 8;
        int numberOfSegments = bits.length / segmentSize;
        int[] reversedBits = new int[bits.length];
        for (int i = 0; i < numberOfSegments; i++) {
            int startIndex = i * segmentSize;
            int reversedIndex = (numberOfSegments - 1 - i) * segmentSize;
            System.arraycopy(bits, startIndex, reversedBits, reversedIndex, segmentSize);
        }
        return reversedBits;
    }
}
