package codewars;

public class CreditCardValidator {
    public static boolean isValidCreditCardNumber(String cardNumber) {
        if (!cardNumber.matches("\\d{1,16}")) {
            return false;
        }
        int sum = 0;
        boolean doubleDigit = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isValidCreditCardNumber("1714"));
        System.out.println(isValidCreditCardNumber("12345"));
        System.out.println(isValidCreditCardNumber("891"));
        System.out.println(isValidCreditCardNumber("4532015112830366"));
    }
}
