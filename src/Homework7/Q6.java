package Homework7;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class DoubleIing {
    public static void main(String[] args) {
        Integer[] t = { -30, -20, 10, 67, 50, -40, -3, 0};
        Stack<Integer> s = new Stack< >();
        fromArrayToCollection(t, s);

        System.out.println(s);
        repeater(s);
        System.out.println(s);

    }


    public static void repeater(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<Integer>();
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while(!q.isEmpty()) {
            int n = q.remove();
            s.push(n);
            s.push(n);
        }
    }
    public static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T x: a)
            c.add(x);
    }

}