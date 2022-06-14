package Draft.Abstract;

public class Chevrolet extends Car{
    public String getModel() {
        return model;
    }

    private String model;

    Chevrolet(String model){
        this.model = model;
    }
}
