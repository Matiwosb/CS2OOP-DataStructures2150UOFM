package Homework7;
import java.util.*;

class RemoveEvenStack {
    public static void main(String[] args) {
        Integer[] t = { -30, -20, 10, 67, 50, -40, -3, 0};
        // add code here to build a stack using the given t[ ]

        Stack<Integer> myStack = new Stack<>();
        for (int i = 0;i < t.length;i++){
            myStack.push(t[i]);
        }
        removeEven1(myStack);
        System.out.println(myStack);
    }

    // trying remove all the even number... what is wrong?
    /*
     * The problem with the code is that it puts the odd elements back at the top of the stack each time,
     * so it will never make progress down the stack toward the bottom.
     *  the code will get stuck in an infinite loop
     */
    public static void removeEven(Stack<Integer> s) {
        while (!s.isEmpty()) {
            int n = s.pop();
            if (n % 2 != 0) {
                s.push(n);
            }
        }
    }

    public static void removeEven1(Stack<Integer> s) {
        // add codes there to build a new removeEven1(.....)
        Stack<Integer> myQueue = new Stack<>();
        while (!s.isEmpty()) {
            int n = s.pop();
            if (n % 2 != 0) {
                myQueue.push(n);
            }
        }
        while (!myQueue.isEmpty()){
            s.push(myQueue.pop());
        }

    } // end of removeEven1

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T x: a)
            c.add(x);
    }
}
