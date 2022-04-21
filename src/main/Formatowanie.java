package main;

public class Formatowanie {

    public static void main(String[] arg) {
        int x = 748388444;

        System.out.println(String.format("Moja liczba %d %.2f niesformatowana", x, 488553.55f));
        System.out.println(String.format("Moja liczba %,d sformatowana", x));


        float f = 45668.67667f;
        System.out.println(String.format("Moja liczba %,.3f sformatowana", f));
    }
}
