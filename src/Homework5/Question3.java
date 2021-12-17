package Homework5;
// Ques
import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        // Declare an array of length 63
        int[] numbers = new int[63];

        // initialize array with random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100); // Generate random number between 0 and 100
        }

        // Display array with 10 elements in a row
        for (int i = 0; i < numbers.length; i ++) {
            System.out.print(numbers[i] + " ");
            if ((i+1)%10==0){
                System.out.println();
            }
        }
        System.out.println( );
        int point;
        Scanner key = new Scanner(System.in);
        System.out.println("Please enter an index between 0 to 62: ");
        while (true) {
            point = key.nextInt();
            try {
                System.out.println("The element is " + numbers[point] + "\n Done!");
//                point = key.nextInt();
              break;

            } catch (IndexOutOfBoundsException e) {
                if (point < 0){
                    System.out.println("index is -ve. Try again");
                }
                else {
                    System.out.println("Out of bound. try again: ");
                }
            }
        }

    }
}
