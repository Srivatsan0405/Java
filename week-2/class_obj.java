public class class_obj {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
    
}
abstract class Vehicle{

    @SuppressWarnings("unused")
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
