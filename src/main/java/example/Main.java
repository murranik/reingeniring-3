package example;

import java.util.List;

public class Main {

    public static final Movie REMBO = new Movie(
            "Rembo",
            2,
            MovieTypes.regular);
    public static final Movie LOTR = new Movie(
            "Lord of the Rings",
            0,
            MovieTypes.new_release);
    public static final Movie HARRY_POTTER = new Movie(
            "Harry Potter",
            1.5,
            MovieTypes.children);
    public static final Movie SAW = new Movie(
            "Saw",
            3,
            MovieTypes.horror);

    public static void main(String[] args) {
        List<Rental> rentals = List.of(new Rental(REMBO, 1),
                new Rental(LOTR, 4),
                new Rental(HARRY_POTTER, 5),
                new Rental(SAW, 7));

        String statement = new Customer("John Doe", rentals).statement();

        System.out.println(statement);
    }
}
