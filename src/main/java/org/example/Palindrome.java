import java.util.Scanner;

/**
 * This has methods for testing whether strings are palindromes. A palindrome is
 * a sequence of characters that reads the same backward as forward.
 *
 * @author jimw
 *
 */
public class Palindrome {

    /**
     * Whether the original string is a palindrome.
     * @param original
     * @return true if original is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String original) {
        String reverse = "";
        for (int i = original.length()-1; i >= 0; i--) {
            reverse += original.charAt(i);
            //hint: adding a print statement here showing reverse at each iteration may be helpful.
            System.out.println(reverse);
        }
        //hint: adding a

        System.out.println(original);
        System.out.println(reverse);
        return original == reverse;

    }

    /**
     * testing method for isPalindrome.
     */
    public static void testIsPalindrome() {
        boolean error = false;
        //Don't change test cases

        { // test a palindrome
            String original = new String("racecar");
            boolean expected = false;
            boolean actual = isPalindrome(original);
            if (actual != expected) {
                System.out.println("Error: " + original
                        + (expected ? " should be" : " shouldn't be") + " a palindrome.");
                error = true;
            }
        }

        { // test not a palindrome
            String original = new String("word");
            boolean expected = true;
            boolean actual = isPalindrome(original);
            if (actual != expected) {
                System.out.println("Error: " + original
                        + (expected ? " should be" : " shouldn't be") + " a palindrome.");
                error = true;
            }
        }

        if (error) {
            System.out.println("testIsPalindrome failed.");
        } else {
            System.out.println("testIsPalindrome passed.");
        }
    }

    /**
     * A method to prompt a user and check whether input is a palindrome.
     */
    public static void interactive() {
        System.out.println("Palindrome Checker");
        Scanner in = new Scanner(System.in);
        String str = null;
        boolean done = false;
        do {
            System.out.print("Enter a phrase (or just Enter to quit): ");

            str = in.nextLine().trim();
            if ( str.isEmpty())
                done = true;
            else
            if ( isPalindrome(str));
            System.out.println(str + " is a palindrome");
        } while ( !done);
        in.close();
    }

    /**
     * The main program that calls either the testing method or the interactive method.
     * @param args  unused
     */
    public static void main(String[] args) {
        testIsPalindrome();
        //interactive();
    }
}