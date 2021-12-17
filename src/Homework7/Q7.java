package Homework7;

import java.util.Collection;
import java.util.Stack;

class StackReflectionOfItself {

    public static void main(String[] args) {
        String[] s = { "doe", "ray", "me", "far", "so", "lar", "chi", "doe"};
        Stack<String> stack = new Stack<String>();
        fromArrayToCollection(s, stack);
        reflectStack(stack);
    }

    public static void reflectStack(Stack<String> s) {

        System.out.println(s);
        Stack<String> stack =(Stack<String>) s.clone();
        Stack<String> reverseStack = new Stack<String>();
        int n = s.size();

        for (int i = 0; i < n; i++) {
            // access the top element
            String element = s.peek();
            // remove the top element
            s.pop();
            // push the element into the reverse stack
            reverseStack.push(element);
        }
        for (int i = 0; i < n; i++) {
            // push the element into the  stack
            s.push(reverseStack.pop());
        }
        for (int i = 0; i < n; i++) {
            // push the element into the extra stack
            s.push(stack.pop());
        }
        System.out.println(s);
    }

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T x: a)
            c.add(x);
    }
}
