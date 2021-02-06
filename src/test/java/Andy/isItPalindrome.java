package Andy;

import java.util.Scanner;

public class isItPalindrome {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Try your best and let's see if it is palindrome: ");
        String word = scan.nextLine();

        System.out.println(palindrome(word));
        scan.close();

    }

    public static boolean palindrome(String word) {
        word = word.trim().replace(" ", "");

        if (word.length() == 2) {
            return word.substring(0, 1).equalsIgnoreCase(word.substring(1, 2));
        } else {
            for (int i = 0; i <= word.length() / 2 - 1; i++) {
                if (!word.substring(i, i + 1).equalsIgnoreCase(word.substring(word.length() - i - 1, word.length() - i)))
                    return false;

            }
        }
        return true;
    }

}

