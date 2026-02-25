import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class CheckerApp {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("WELCOME");
        System.out.println("====================================");
        System.out.println("Palindrome Checker - Queue & Stack Version");
        System.out.println("====================================");

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
            queue.add(word.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < word.length(); i++) {
            if (!stack.pop().equals(queue.remove())) {
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