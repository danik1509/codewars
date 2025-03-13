package codewars;

public class CircleGame {
    public static String[] orderOfLeaving(String[] names) {
        int n = names.length;
        String[] leavingOrder = new String[n - 1];
        boolean[] inGame = new boolean[n];
        for (int i = 0; i < n; i++) {
            inGame[i] = true;
        }
        int leavingIndex = 0;
        int index = 0;
        while (leavingIndex < n - 1) {
            int count = 0;
            while (count < 2) {
                if (inGame[index]) {
                    count++;
                }
                if (count < 2) {
                    index = (index + 1) % n;
                }
            }
            leavingOrder[leavingIndex++] = names[index];
            inGame[index] = false;
            index = (index + 1) % n;
        }
        return leavingOrder;
    }
    public static void main(String[] args) {
        String[] names = {"Bob", "Lorna", "Desiree", "Melissa", "Josh"};
        String[] result = orderOfLeaving(names);

        for (String name : result) {
            System.out.println(name);
        }
    }
}