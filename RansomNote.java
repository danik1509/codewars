package codewars;

public class RansomNote {

    public static boolean canConstruct(String note, String magazine) {
        int[] magazineCount = new int[256];
        int[] noteCount = new int[256];
        for (char c : magazine.toLowerCase().toCharArray()) {
            c = substitute(c);
            magazineCount[c]++;
        }
        for (char c : note.toLowerCase().toCharArray()) {
            c = substitute(c);
            noteCount[c]++;
        }
        for (int i = 0; i < noteCount.length; i++) {
            if (noteCount[i] > magazineCount[i]) {
                return false;
            }
        }
        return true;
    }
    private static char substitute(char c) {
        switch (c) {
            case '4': return 'a';
            case '3': return 'e';
            case '1': return 'i';
            case '0': return 'o';
            case '5': return 's';
            case '2': return 'z';
            default: return c;
        }
    }
    public static void main(String[] args) {
        String note = "Please pay $5000";
        String magazine = "I can pay you 5000 dollars";
        boolean result = canConstruct(note, magazine);
        System.out.println("Можно ли создать записку? " + result);
    }
}
