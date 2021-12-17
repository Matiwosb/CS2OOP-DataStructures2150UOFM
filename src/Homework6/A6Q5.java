package Homework6;

public class A6Q5 {
    public static void main(String[] args) {
        Integer[] list = { 4, 12, 4, 19, -83, 99, -1, -12};
        String[] names = { "Steph", "COMP2150", "LeBron James", "James","Steph","COMP2150" };

        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("looking for -12 index = " + linearSearch(list, -12));
        System.out.println("looking for \"James\" index= " + linearSearch(names, "James"));
    }

    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
        for (int i = 0; i < list.length; i++)
            if (list[i].equals(key))
                return i;
        return -1;
    }

}
