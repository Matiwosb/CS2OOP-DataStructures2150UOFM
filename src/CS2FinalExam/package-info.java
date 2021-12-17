package CS2FinalExam;

/*
 * This program is for Q4_2 -> Test the retallAll(set1, set2) method (that you are writing) that
 * takes two sets of integers as parameters and
 * removes any values in the first set that are not found in the second set
 *
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Fall21_Q4_2 {
    public static void main(String[] args) {

        Integer[] aInt1 = { 0, 19, 8, 9, 12, 13, 14, 15 };
        Integer[] aInt2 = { 0, 19, 2, 4, 5, 9, 10, 11};
        System.out.println("Original arrays ");
        display(aInt1);
        display(aInt2);


        ArrayList<Integer> alterList1 = new ArrayList<>();
        ArrayList<Integer> alterList2 = new ArrayList<>();


        fromArrayToCollection(aInt1, alterList1);
        fromArrayToCollection(aInt2, alterList2);


        Set<Integer> s1 = new HashSet<>();
        s1.addAll(alterList1);

        Set<Integer> s2 = new HashSet<>();
        s2.addAll(alterList2);

        System.out.println("before retainAll(..) ");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        retainAll(s1, s2);
        System.out.println("after retainAll(s1, s2)");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);



    }
    /* Write a method called retainAll that takes two sets of integers as parameters
     *  and that removes any values in the first set that are not found in the second set
     *
     *  Note the arguments are Set<Integer> type
     */


    public static void retainAll(Set<Integer> s1, Set<Integer> s2) {
        Iterator<Integer> i = s1.iterator();
        while (i.hasNext()) {
            if (!s2.contains(i.next())) {
                i.remove();
            }
        }
    }

    static <E> void display(E arr[]) {
        for(E ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static <T> void fromArrayToCollection(T a[], Collection<T> c) {
        for (T x: a)
            c.add(x);
    }


}
