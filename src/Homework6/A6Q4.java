package Homework6;

import java.util.ArrayList;
import java.util.Arrays;

class RemoveDuplicates{
    public static <E>ArrayList<E>removeDuplicates(ArrayList<E>list){
        ArrayList<E> newList = new ArrayList<>();
        for (int i = 0;i<list.size();++i){
            if (!newList.contains(list.get(i))){
                newList.add(list.get(i));
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(11, 22, 25, 15, 15, 15, 11));
        System.out.println("original Integer list" + numbers);
        System.out.println("nodup  list " + removeDuplicates(numbers));
        System.out.println();
        System.out.println("Same method for the name list");
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Lakers", "Bucks", "Bulls", "Bulls",
                                                                "Nets", "Warriors", "Lakers", "Warriors", "Spurs"));
        System.out.println("original list" + names);
        System.out.println("nodup  list" + removeDuplicates(names));
    }
}