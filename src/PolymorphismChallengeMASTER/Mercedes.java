package PolymorphismChallengeMASTER;

public class Mercedes extends Car {

    // constructor

    public Mercedes(String name, int cylinders) {
        super(name, cylinders);
    }


    // methods

    public String startEngine() {
        return "PUBLIC CLASS Mercedes : " + getName() + "  (Mercedes) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS Mercedes : " + getName() + "  (Mercedes) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS Mercedes : "  + getName() + " (Mercedes) is braking...";
    }
}
