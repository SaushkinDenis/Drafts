package Draft.Abstract;

public abstract class Car {
    void move(){
        System.out.println("CarCar is moving...");
    }

    void stop(){
        System.out.println("Car stopped");
    }

    abstract String getModel();
}
