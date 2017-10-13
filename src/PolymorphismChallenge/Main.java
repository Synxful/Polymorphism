package PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {

        Car sAMG = new Mercedes("S Klasse AMG");
        Car rs6 = new Audi("RS6");
        Car m5 = new BMW("M5");

        sAMG.startEngine();
        sAMG.accelerate();
        sAMG.brake();

        rs6.startEngine();
        rs6.accelerate();
        rs6.brake();

        m5.startEngine();
        m5.accelerate();
        m5.brake();


    }
}
