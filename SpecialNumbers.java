package codewars;

public class SpecialNumbers {
    public static void main(String[] args) {
        int n = 2;
        int result = findNthTerm(n);
        System.out.println("The " + n + "th term is: " + result);
    }
    public static int findNthTerm(int n) {
        int count = 0;
        int number = 10;

        while (count < n) {
            int sumOfDigits = sumDigits(number);
            int power = 2;
            while (true) {
                int poweredValue = (int) Math.pow(sumOfDigits, power);
                if (poweredValue == number) {
                    count++;
                    break;
                } else if (poweredValue > number) {
                    break;
                }
                power++;
            }
            number++;
        }
        return number - 1;
    }
    private static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}