package Udcity.PolymorphismExample;

class Vehicle{
    protected String start;
    protected String stop;
    protected String speed;
    protected String direction;

    public Vehicle(String start, String stop, String speed, String direction) {
        this.start = start;
        this.stop = stop;
        this.speed = speed;
        this.direction = direction;
    }

    public void start(){
        System.out.println(start);
    }

    public void stop(){
        System.out.println(stop);
    }

    public void speed(){
        System.out.println(speed);
    }

    public void direction(){
        System.out.println(direction);
    }
}

class Boat extends Vehicle{
    public Boat(){
        super("Boat start", "Boat stop", "Boat speed","Boat direction");
    }

    public void depthFinder(){
        System.out.println("How deep is this water?");
    }
}

class Plane extends Vehicle{
    public Plane(){
        super("Plane start", "Plane stop", "Plane speed","Plane direction");
    }
    public void altitude(){
        System.out.println("How high are we?");
    }
}

class Car extends Vehicle{
    public Car(){
        super("Car start", "Car stop", "Car speed","Car direction");
    }
}

class VehicleTester{
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//
//        Boat boat = new Boat();
//        boat.start();
//        boat.depthFinder();
//
//        Plane plane = new Plane();
//        plane.start();
//        plane.altitude();
//
//        System.out.println(plane);

        // Polymorphism
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();

        for (int i = 0; i < vehicles.length; i++){
            Vehicle vehicle = vehicles[i];
            vehicle.speed();
        }
    }
}