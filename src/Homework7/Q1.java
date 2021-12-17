package Homework7;

import java.util.Stack;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
/*
 * This program sort a given Integer array[] into odd for queue and even for the stack
 *
 */

class Sort2StackQueue {
    public static void main(String[] args) {
        Integer[] t = { 1, 4, 5, 67, 23, 2, 111, -13, 88, 20, -20};
        Queue<Integer> q = new LinkedList< >();
// build q using the static method 	fromArrayToCollection(t, q);
        fromArrayToCollection(t,q);

// print the queue
        System.out.println("queue: " + q);

// finish the static method sort2SK_Qu(q) below
//  call the method here to show the result
        sort2Sk_Qu(q);

    }

    // complete the following method to display the results for stack and queue
    public static void sort2Sk_Qu(Queue<Integer> q) {
        Stack<Integer> s = new Stack<Integer>();

//... add codes here.
        int size = q.size();

        for (int i = 0; i < size;i++){
           int val = q.remove();
            if (val%2 == 0){
                s.push(val);
                }
            else{
                q.add(val);
            }
        }

        System.out.println("queue: " + q + "; Stack: " + s);

    }
    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T x: a)
            c.add(x);
    }

}

