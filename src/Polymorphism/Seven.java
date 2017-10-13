package Polymorphism;

public class Seven extends Movie {

    public Seven() {
        super("Seven");
    }

    @Override
    public String plot() {
        return "Life is not fair..";
    }
}
