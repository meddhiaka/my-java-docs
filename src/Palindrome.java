public class Palindrome {

    public static boolean isPalindrome(String ch) {
        String reversed = new StringBuilder(ch).reverse().toString();
        return reversed.equals(ch);
    }

    public static void main(String[] args) {
        String str = "ACBCA";
        if (isPalindrome(str)) {
            System.out.println("the string " + str + " is palindrome");
        } else {
            System.out.println("the string " + str + " is not palindrome");
        }
    }

}