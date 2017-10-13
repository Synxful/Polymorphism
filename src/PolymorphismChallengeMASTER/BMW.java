package PolymorphismChallengeMASTER;

public class BMW extends Car {

    // constructor

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    // methods

    public String startEngine() {
        return "PUBLIC CLASS BMW : " + getName() + " (BMW) its engine started...";
    }

    public String accelerate() {
        return "PUBLIC CLASS BMW : " + getName() + " (BMW) is accelerating...";
    }

    public String brake() {
        return "PUBLIC CLASS BMW : " + getName() + " (BMW) is braking...";
    }


}
