package Draft.Abstract;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Volvo("RTD");
        Car car2 = new Chevrolet("TRIO");

        System.out.println(car1.getModel());
        System.out.println(car2.getModel());
    }

    public String getModel(Car car){
        return car.getModel();
    }
}
