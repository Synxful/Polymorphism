package PolymorphismChallenge;

public class Audi extends Car {

    private String model;

    public Audi(String model) {
        super(true, 8, 4);
        this.model = model;
    }

// methods

    public String startEngine() {
        return "PUBLIC CLASS Audi : " + model + " (Audi) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS Audi : " + model + " (Audi) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS Audi : " + model + " (Audi) is braking...";
    }


    // getters

    public String getModel() {
        return model;
    }
}
