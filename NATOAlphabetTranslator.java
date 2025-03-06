package codewars;

public class NATOAlphabetTranslator {
    private static final String[] NATO = {
            "Alfa", "Bravo", "Charlie", "Delta", "Echo",
            "Foxtrot", "Golf", "Hotel", "India", "Juliett",
            "Kilo", "Lima", "Mike", "November", "Oscar",
            "Papa", "Quebec", "Romeo", "Sierra", "Tango",
            "Uniform", "Victor", "Whiskey", "Xray", "Yankee",
            "Zulu", "Zero", "One", "Two", "Three",
            "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };
    public static String translateToNato(String phrase) {
        StringBuilder result = new StringBuilder();
        for (char ch : phrase.toCharArray()) {
            if (Character.isLetter(ch)) {
                int index = Character.toUpperCase(ch) - 'A';
                if (index >= 0 && index < 26) {
                    result.append(NATO[index]).append(" ");
                }
            } else if (Character.isDigit(ch)) {
                int index = ch - '0' + 26;
                result.append(NATO[index]).append(" ");
            } else if (ch == ',' || ch == '.' || ch == '!' || ch == '?') {
                result.append(ch).append(" ");
            }
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "If, you can read?";
        String output = translateToNato(input);
        System.out.println(output);
    }
}
