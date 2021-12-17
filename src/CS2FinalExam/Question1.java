package CS2FinalExam;
import java.util.*;

/*
 * This program is for Q4_1 -> Test the alternating method that takes two list as the parameters and return a new
 * list containing alternating elements from the two lists
 */
class Fall21_Q4_1 {
    public static void main(String[] args) {

        Integer[] aInt1 = { 10, 30, 50, 70, 90 };
        Integer[] aInt2 = { 20, 40, 60, 80, 100};

        display(aInt1);
        display(aInt2);


        ArrayList<Integer> aIntLis1 = new ArrayList<>();
        ArrayList<Integer> aIntLis2 = new ArrayList<>();
        List<Integer> altList = new ArrayList<>();


        fromArrayToCollection(aInt1, aIntLis1);
        fromArrayToCollection(aInt2, aIntLis2);

//		Uncomment the following two lines to display combined list with alternative arrangment
        altList= alternate(aIntLis1, aIntLis2);
        System.out.println(" alternating in one list \n" + altList);

    }
    // method to alternate two list and returns a new list


    static <E> void display(E arr[]) {
        for(E ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    // write the static method here that returns a List contains alternate arrange of
    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<Integer>();
        Iterator<Integer> i1 = list1.iterator();
        Iterator<Integer> i2 = list2.iterator();
        while (i1.hasNext() || i2.hasNext()) {
            if (i1.hasNext()) {
                result.add(i1.next());
            }
            if (i2.hasNext()) {
                result.add(i2.next());
            }
        }
        return result;
    }

    public static <T> void fromArrayToCollection(T a[], Collection<T> c) {
        for (T x: a)
            c.add(x);
    }

}
