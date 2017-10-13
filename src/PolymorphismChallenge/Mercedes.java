package PolymorphismChallenge;

public class Mercedes extends Car {

    private String model;

    public Mercedes(String model) {
        super(true, 12, 5);
        this.model = model;
    }

    // methods

    public String startEngine() {
        return "PUBLIC CLASS Mercedes : " + model + "  (Mercedes) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS Mercedes : " + model + "  (Mercedes) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS Mercedes : "  + model + " (Mercedes) is braking...";
    }


    // getters

    public String getModel() {
        return model;
    }
}
