package Polymorphism;

public class Main {
    public static void main(String[] args) {
        for(int i= 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #'" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int)(Math.random()* 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new GetRichOrDieTryin();
            case 2:
                return new MazeRunner();
            case 3:
                return new Seven();
            case 4:
                return new AmericanSniper();
            case 5:
                return new NeedForSpeed();
            default:
                return null;
        }
    }
}
