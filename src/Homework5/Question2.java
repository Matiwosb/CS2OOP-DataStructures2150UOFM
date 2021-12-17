package Homework5;

import java.util.Scanner;

class AgeIsNegativeException extends Exception{
    public AgeIsNegativeException(String message){
        super(message);
    }
    public AgeIsNegativeException(){
        super();
    }
}
class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declaring Scanner variable to take input from user

        System.out.println("Enter Your Age");

        int age = sc.nextInt(); // Taking input from user

        try {
            if (age < 0) {
                throw new AgeIsNegativeException("negative? -- back to the future? "); // it has an object class so you to create
                // class file to print the error
            }
            System.out.println(" Age entered = " + age);
        }

        catch (Exception ex) {
            System.err.println(ex); // Prints exception description
        }
    }
}