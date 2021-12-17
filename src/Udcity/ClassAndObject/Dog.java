package Udcity.ClassAndObject;

/**
 *
 *
 */

public class Dog { // class name
    private String dogType; // instance variable ==> (States)
    private String dogName;
    private String dogColor;
    private int dogAge;

    public Dog(String dogType, String dogName, String dogColor, int dogAge){ // constructor
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    //accessor for dogType and returns the dogType
    public String getDogType() {
        return dogType;
    }

    // Mutator for dogType and set the dogType from the class by using "this" and assigns to parameter dogType
    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    //accessor for dogName and returns the dogName
    public String getDogName() {
        return dogName;
    }

    //Mutator for dogName and set the dogName from the class by using "this" and assigns to parameter dogName
    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    //accessor for dogColor and returns the dogColor
    public String getDogColor() {
        return dogColor;
    }

    //Mutator for dogColor and set the dogColor from the class by using "this" and assigns to parameter dogColor
    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    //accessor for dogAge and returns the dogAge
    public int getDogAge() {
        return dogAge;
    }

    //Mutator for dogAge and set the dogAge from the class by using "this" and assigns to parameter dogAge
    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Dog type: " + dogType + " Dog name: " + dogName + " DogColor: " + dogColor + " Dog age " + dogAge;

    }
}
class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Dooble", "Iya", "black", 23);
//        dog.getDogAge();
//        dog.getDogColor();
//        dog.getDogName();
//        dog.getDogType();
        System.out.println(dog); // calls the dog reference variable to print out the Dog objects such as in "line 69"
    }
}