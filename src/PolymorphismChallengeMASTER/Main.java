package PolymorphismChallengeMASTER;

public class Main {
    public static void main(String[] args) {

        Mercedes sAMG = new Mercedes("S Klasse AMG", 8);
        Audi rs6 = new Audi("RS6",6);
        BMW m5 = new BMW("M5", 4);
        Opel astra = new Opel("Astra", 2);

        System.out.println(sAMG.startEngine());
        System.out.println(sAMG.accelerate());
        System.out.println(sAMG.brake());

        System.out.println(rs6.startEngine());
        System.out.println(rs6.accelerate());
        System.out.println(rs6.brake());

        System.out.println(m5.startEngine());
        System.out.println(m5.accelerate());
        System.out.println(m5.brake());

        System.out.println(astra.startEngine());
        System.out.println(astra.accelerate());
        System.out.println(astra.brake());

    }
}
