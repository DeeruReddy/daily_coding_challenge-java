import java.util.*;

public class StackSizeWithoutSizeMethod {

    // Function to find stack size without using .size()
    public static int getStackSize(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();
        int count = 0;

        // Pop elements and count
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
            count++;
        }

        // Restore original stack
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return count;
    }

    public static void main(String[] args) {
        // Test Case 1
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);

        System.out.println("Input Stack: " + stack1);
        System.out.println("Output: " + getStackSize(stack1));

        // Test Case 2
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5);
        stack2.push(15);
        stack2.push(25);

        System.out.println("Input Stack: " + stack2);
        System.out.println("Output: " + getStackSize(stack2));
    }
}
