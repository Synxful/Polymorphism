package PolymorphismChallengeMASTER;

public class Opel extends Car {

    // constructor

    public Opel(String name, int cylinders) {
        super(name, cylinders);
    }

    // methods

    public String startEngine() {
        return "PUBLIC CLASS Opel : " + getName() + " (Opel) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS Opel : " + getName() + " (Opel) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS Opel : " + getName() + " (Opel) is braking...";
    }
}
