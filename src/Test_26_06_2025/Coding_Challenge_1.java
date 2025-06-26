package Test_26_06_2025;

import java.util.Scanner;

public class Coding_Challenge_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int length = input.length();

        char firstChar = input.charAt(0);

        String substring;
        if (length >= 5) {
            substring = input.substring(length - 5);
        } else {
            substring = input ;

            // output

            System.out.println("Length: " + length);
            System.out.println("First char: " + firstChar);
            System.out.println("Substring: " + substring);

        }
    }

}
