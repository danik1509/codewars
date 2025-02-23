package codewars;

public class NarcissisticNumber {
    public static void main(String[] args) {
        int number = 1634;
        boolean result = isNarcissistic(number);
        System.out.println(result);
    }
    public static boolean isNarcissistic(int number) {
        String numStr = Integer.toString(number);
        int numDigits = numStr.length();
        int sum = 0;

        for (char digit : numStr.toCharArray()) {
            int digitValue = Character.getNumericValue(digit);
            sum += Math.pow(digitValue, numDigits);
        }
        return sum == number;
    }
}
