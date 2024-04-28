package example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testStatement() {
        // Arrange
        Movie rembo = new Movie("Rembo", 0, MovieTypes.regular);
        Movie lotr = new Movie("Lord of the Rings", 0, MovieTypes.new_release);
        Movie harryPotter = new Movie("Harry Potter", 0, MovieTypes.children);
        Movie saw = new Movie("Saw", 0, MovieTypes.horror);

        List<Rental> rentals = Arrays.asList(
                new Rental(rembo, 1),
                new Rental(lotr, 4),
                new Rental(harryPotter, 5),
                new Rental(saw, 5));

        Customer customer = new Customer("Nikita", rentals);

        // Act
        String statement = customer.statement();

        // Assert
        String expected = "Rental Record for Nikita\n" +
                "\tRembo\t2.0\n" +
                "\tLord of the Rings\t12.0\n" +
                "\tHarry Potter\t4.5\n" +
                "\tSaw\t3.0\n" +
                "Amount owed is 21.5\n" +
                "You earned 6 frequent renter points";

        assertEquals(expected, statement);
    }
}