import java.util.Stack;
public class CheckerApp {
    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Checker - Stack Version");
        System.out.println("====================================");

        String word = "madam";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}