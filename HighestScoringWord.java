package codewars;

public class HighestScoringWord {
    public static void main(String[] args) {
        String input = "modsen bsuir autobanh delete traffic";
        String highestScoringWord = findHighestScoringWord(input);
        System.out.println("Highest scoring word: " + highestScoringWord);
    }
    public static String findHighestScoringWord(String input) {
        String[] words = input.split(" ");
        String highestWord = "";
        int highestScore = 0;

        for (String word : words) {
            int score = calculateScore(word);
            if (score > highestScore) {
                highestScore = score;
                highestWord = word;
            }
        }
        return highestWord;
    }
    private static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score += c - 'a' + 1;
        }
        return score;
    }
}