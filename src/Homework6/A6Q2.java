package Homework6;

import java.util.ArrayList;
import java.util.Iterator;

class GenericStack <E> extends ArrayList <E>{

    public boolean isEmpty() {
        return isEmpty();
    }

    public int getSize() {
        return size();
    }

    public E peek() {
        return get(getSize() - 1);
    }

    public E pop() {
       E o = get(getSize() - 1);
        remove(getSize() - 1);
        return o;
    }

    public void push(E o) {
        add(o);
    }

    @Override /** Override the toString in the Object class */
    public String toString() {
        return "stack: " + super.toString();

    }
}

public class A6Q2 {
    public static void main(String[] args) {
        GenericStack<String> stringMyStack = new GenericStack<>();
        System.out.println("start building (NBA) stack");
        stringMyStack.push("Warriors");
        stringMyStack.push("Laker");
        stringMyStack.push("Bulls");
        stringMyStack.push("Celtics");
        stringMyStack.push("Heats");
        stringMyStack.push("Nets");
        stringMyStack.push("Suns");
        System.out.println(stringMyStack);

        System.out.println("Number of names = " + stringMyStack.getSize());
        System.out.println("peek the stack = " + stringMyStack.peek());
        System.out.println("pop the stack = " + stringMyStack.pop());

        System.out.println("List the list Using Iterator: ");

        Iterator<String> it = stringMyStack.iterator();
        while (it.hasNext()){
            System.out.print(it.next() + ", ");
        }
        System.out.println(" ");

        GenericStack<Integer> integersMyStack = new GenericStack<>();
        System.out.println("\nstart building (Integer) stack");
        integersMyStack.push(10);
        integersMyStack.push(20);
        integersMyStack.push(30);
        integersMyStack.push(40);
        integersMyStack.push(50);
        integersMyStack.push(9999);
        System.out.println(integersMyStack);

        System.out.println("Number of names = " + integersMyStack.getSize());
        System.out.println("peek the stack = " + integersMyStack.peek());
        System.out.println("pop the stack = " + integersMyStack.pop());

        System.out.println("List the list Using Iterator: ");

        Iterator<Integer> integerIterator = integersMyStack.iterator();
        while (integerIterator.hasNext()){
            System.out.print(integerIterator.next() + " ");
        }
        System.out.println();

    }
}