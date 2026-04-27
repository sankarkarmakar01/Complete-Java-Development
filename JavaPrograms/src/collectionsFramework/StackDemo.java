package collectionsFramework;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

//        stack.add(10);
//        stack.add(55);
//        stack.add(98);

        stack.push(100);
        stack.push(500);
        stack.push(900);

        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search(500));

    }
}
