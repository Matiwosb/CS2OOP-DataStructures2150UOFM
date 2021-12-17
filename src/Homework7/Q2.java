package Homework7;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 class RemoveNMod {

     public static void main(String[] args) {
        Integer[] t = { -30, -20, 10, 67, 50, -40, -3, 0};
        Queue<Integer> q = new LinkedList< >();

        fromArrayToCollection(t,q);
        System.out.println(q.size());
        removeMinus(q);

    }


     public static void removeMinus(Queue<Integer> q) {
         // add codes here....
         // remove the negative number
         // change all the leave over even number to negative
         // keep the odd number without change
         Stack<Integer> s = new Stack<Integer>();

         int size = q.size();

         for (int i = 0; i < size; i++) {
             int e = q.remove();
             if (e > 0) {
                 if (e%2 == 0){
                     s.push(-e);
                 }
                 else {
                     s.push(e);
                 }

             }

         }
             System.out.println("Result: " + s);

     }
         public static <T> void fromArrayToCollection (T[] a, Collection<T> c){
             for (T x : a)
                 c.add(x);
         }



}


