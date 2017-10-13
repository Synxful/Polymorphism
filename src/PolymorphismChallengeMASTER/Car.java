package PolymorphismChallengeMASTER;

public class Car {

    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    // constructor

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    // methods

    public String startEngine() {
        return "PUBLIC CLASS CAR : Engine started.";
    }

    public String accelerate() {
        return "PUBLIC CLASS CAR : Car accelerated.";
    }

    public String brake() {
        return "PUBLIC CLASS CAR : Car is braking.";
    }

    // getters

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
}
