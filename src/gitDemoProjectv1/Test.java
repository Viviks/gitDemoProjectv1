package gitDemoProjectv1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    static boolean isPalindrome(String str) {
        int length = str.length();

        // Compare characters from the beginning and end of the string
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false; // If characters do not match, it's not a palindrome
            }
        }
        return true; // If all characters match, it's a palindrome
    }
}
