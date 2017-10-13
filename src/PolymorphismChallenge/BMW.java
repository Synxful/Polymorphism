package PolymorphismChallenge;

public class BMW extends Car {

    private String model;

    public BMW(String model) {
        super(true, 6, 4);
        this.model = model;
    }

    // methods

    public String startEngine() {
        return "PUBLIC CLASS BMW : " + model + " (BMW) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS BMW : " + model + " (BMW) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS BMW : " + model + " (BMW) is braking...";
    }


    // getters

    public String getModel() {
        return model;
    }
}
