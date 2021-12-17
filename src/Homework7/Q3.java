package Homework7;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class FIndMaxInQ {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>() ;
        Integer[] t = { 1, 4, 5, 67, 23, 2, 56, 11, -2, 99};
        // add codes here
        fromArrayToCollection(t, q);
        System.out.println("Maximum is "+max1(q));


    }// end of main

    // this max() destroys the queue
    public static Integer max (Queue<Integer> q) {

        int maxValue = q.remove();
        for (int i = 0; i < q.size(); i++) {

            maxValue = Math.max(maxValue, q.remove());
        }
        System.out.println(q);
        return maxValue;
    }

    // this max1() fix the problem

    public static Integer max1(Queue<Integer> q) {
        //Integer maxValue =0; // dummy line to get it start
        // add codes here....
        Integer maxValue = q.remove();
        q.add(maxValue); //add it back to the end
        for(int i=0; i<q.size()-1; i++) {
            Integer current = q.remove();
            maxValue=Math.max(maxValue, current);
            q.add(current);
        }
        System.out.println(q);
        return maxValue;
    }

    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T x: a)
            c.add(x);
    }
}