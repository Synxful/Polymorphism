package PolymorphismChallengeMASTER;

public class Audi extends Car {

    // constructor

    public Audi(String name, int cylinders) {
        super(name, cylinders);
    }

    // methods

    public String startEngine() {
        return "PUBLIC CLASS Audi : " + getName() + " (Audi) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS Audi : " + getName() + " (Audi) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS Audi : " + getName() + " (Audi) is braking...";
    }
}
