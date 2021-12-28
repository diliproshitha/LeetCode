package easy;

public class Palindrome {

    public static void main(String[] args) {
        int num = 1222;
        boolean isPalindrome = isPalindrome(num);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        String numStr = Integer.toString(x);
        for (int i = 0; i < numStr.length() / 2; i++) {
            if (numStr.charAt(i) != numStr.charAt(numStr.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
