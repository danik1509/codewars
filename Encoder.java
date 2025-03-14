package codewars;

abstract class Encoder {
    public abstract String encode(String input);
}
class Leetspeak extends Encoder {
    @Override
    public String encode(String input) {
        if (input == null) {
            return "";
        }
        StringBuilder encoded = new StringBuilder();
        String lowerInput = input.toLowerCase();
        for (char c : lowerInput.toCharArray()) {
            switch (c) {
                case 'a':
                    encoded.append('4');
                    break;
                case 'e':
                    encoded.append('3');
                    break;
                case 'l':
                    encoded.append('1');
                    break;
                case 'm':
                    encoded.append("/^^\\");
                    break;
                case 'o':
                    encoded.append('0');
                    break;
                case 'u':
                    encoded.append("(_)");
                    break;
                default:
                    encoded.append(c);
                    break;
            }
        }
        return encoded.toString();
    }
    public static void main(String[] args) {
        Leetspeak leetspeak = new Leetspeak();
        System.out.println(leetspeak.encode("Hello"));
        System.out.println(leetspeak.encode("Leetspeak"));
        System.out.println(leetspeak.encode("Moo"));
        System.out.println(leetspeak.encode("Null"));
        System.out.println(leetspeak.encode(null));
    }
}
