package arrays.palindrome;

public class PalindromeStringUsingReverse {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome("shivam");
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String input) {
        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
