package Homework7;

import java.util.Collection;
import java.util.Stack;

class RemoveLongStack {
    public static void main(String[] args) {
        String[] t = { "hello", "my", "fellow", "Programmers", "Happy", "Days"};

        Stack<String> myStack = new Stack<>();
        for (int i = 0;i < t.length;i++){
            myStack.push(t[i]);
        }
        removeLongestStr(myStack);
    }

    public static void removeLongestStr(Stack<String> s) {
        // add codes there to build a new removeEven1(.....)
        Stack<String> myQueue = new Stack<>();
        String longest = "";
        while (!s.isEmpty()) {
            String n = s.pop();
            if (n.length()>longest.length()) {
                longest=n;
            }
            myQueue.push(n);
        }
        //System.out.println(myQueue);
        while (!myQueue.isEmpty()){
            s.push(myQueue.pop());
        }
        System.out.println(s);
        System.out.println("The longest string is: " + longest);
    }


    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T x: a)
            c.add(x);
    }
}
