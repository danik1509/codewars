package codewars;

import java.util.Scanner;

public class Likes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input names, separated by commas: ");
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println(getLikesText(new String[]{}));
        } else {
            String[] names = input.split(",\\s*");
            String result = getLikesText(names);
            System.out.println(result);
        }
        scanner.close();
    }
    public static String getLikesText(String[] names) {
        int count = names.length;
        if (count == 0) {
            return "No one likes this";
        } else if (count == 1) {
            return names[0] + " likes this";
        } else if (count == 2) {
            return names[0] + " and " + names[1] + " like this";
        } else if (count == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else {
            return names[0] + ", " + names[1] + " and " + (count - 2) + " others like this";
        }
    }
}
