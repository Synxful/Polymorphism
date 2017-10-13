package PolymorphismChallenge;

public class Car {

    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(boolean engine, int cylinders, int wheels) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    // methods

    public String startEngine() {

        System.out.println("PUBLIC CLASS CAR : Engine started.");
        return "PUBLIC CLASS CAR : Engine started.";

    }

    public String accelerate() {
        return "PUBLIC CLASS CAR : Car accelerated.";
    }

    public String brake() {
        return "PUBLIC CLASS CAR : Car is braking.";
    }




    // getters
    public boolean getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}
