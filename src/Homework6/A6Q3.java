package Homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.print(" ");

        List<String> strings = new ArrayList<String>();
        strings.add("Steph");
        strings.add("Klay");
        strings.add("Andre");
        strings.add("Draymond");
        strings.add("Andrew");
        System.out.println();
        //hasNext = forward
        System.out.println("list1: forward order with iterator");
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next() + ", ");
        }
        System.out.println();
        //hasPrevious = backward
        System.out.println("list1: Reverse order with iterator");
        while (listIterator.hasPrevious()){
            System.out.print(listIterator.previous() + ", ");
        }
        System.out.println();

        System.out.println("list2: forward order with iterator");
        ListIterator<String> listIterator1 = strings.listIterator();
        while (listIterator1.hasNext()){
            System.out.print(listIterator1.next() + ", ");
        }
        System.out.println();
        System.out.println("list2: Reverse order with iterator");
        while (listIterator1.hasPrevious()){
            System.out.print(listIterator1.previous() + ", ");
        }
        System.out.println();
        System.out.println("Display the original lists");
        System.out.println(list);
        System.out.println(strings);
    }
}