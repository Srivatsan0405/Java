public class class_obj {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        System.out.println("The car is now running.");
        car.stop();
        System.out.println("The car has been stopped using the stop method.");
    }
    
}
abstract class Vehicle {

    Vehicle() {
        System.out.println("Vehicle is created");
    }

    abstract void start();
    @SuppressWarnings("unused")
    abstract void stop();       
}
class Car extends Vehicle{
    @Override

    void start(){
        System.out.println("Car started");
    }
    @Override
    void stop(){
        System.out.println("Car stopped");
    }
}
