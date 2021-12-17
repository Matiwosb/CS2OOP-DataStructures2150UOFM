package Homework5;
//exceptions/Assign5_7TryCatch.java

/* This program is designed for assignment 5. The purpose is to exercise the try-catch (error handling) behaviors under
 * various conditions. Please follow the steps( 1 to 8) written in the assignment 5 to observe and explain each
 * of the situations.
 */


class Assign5_7TryCatch {
    private static Integer i = null;

    public static void main(String[] args) {
        //System.out.println(i.toString()); It does not do anything so it goes to try and catch to find an error and
        // does not find and it crashes
        // step 3: leads to NullPointerException: It is giving this because it does not find the object i which is null
        try {
            System.out.println(i.toString());
        } catch (NullPointerException e) {
            System.err.println(" ^^^^ Caught NullPointerException 1111"); // prints when caused error
            e.printStackTrace(); // step 4 it does not give error value when it is commented
        }
        try {
            // Step 8: addd code int y = 9/0 after putting Step 7 back to the right order y =9/0;
            // 9 is divided by 0 so the Exception x handles that error
            // step 5: add code i = 100, run it; change i = null
            //i = 100; //When i = 100, try catch first, and then it prints the error and error line.
            // Then, it goes and print out the value 100
            i = 9 / 0;
            //i = null;
            System.out.println(i.toString());
        }
//	step 7; Change order with Exception X; It creates error because NullPointerException will never be reached because Exception will catch all types of
//	Exception including NullPointerException
        catch (NullPointerException e) { //catch first
            System.err.println("***** Caught NullPointerException 2222 "); //prints the error massage
            e.printStackTrace(); // step 4; comment this line and uncomment this line...
            // display what kind error it is and the error line number
        }
        // step 6: add the extra catch (Exception x) here.
        catch (Exception x) { //it catches all kinds' exception specifically when I put the 9/0 it gave ArithmeticException and the error value
            System.err.println(" I am Exception !!!");
            x.printStackTrace();
        }
        //the try catch does not print out last catch

        finally {
            System.out.println("I am here finally..."); //runs no matter what
        }
    }
}