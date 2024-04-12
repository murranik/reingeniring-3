package example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static example.Movie.MovieType.*;
import static org.junit.Assert.assertEquals;

public class CustomerTest {
    @Test
    public void testStatement() {
        // Arrange
        Movie rembo = new Movie("Rembo", Movie.MovieType.REGULAR);
        Movie lotr = new Movie("Lord of the Rings", Movie.MovieType.NEW_RELEASE);
        Movie harryPotter = new Movie("Harry Potter", Movie.MovieType.CHILDRENS);

        List<Rental> rentals = Arrays.asList(
                new Rental(rembo, 1),
                new Rental(lotr, 4),
                new Rental(harryPotter, 5)
        );

        Customer customer = new Customer("Nikita", rentals);

        // Act
        String statement = customer.statement();

        // Assert
        String expected = "Rental Record for Nikita\n" +
                "\tRembo\t2.0\n" +
                "\tLord of the Rings\t12.0\n" +
                "\tHarry Potter\t4.5\n" +
                "Amount owed is 18.5\n" +
                "You earned 4 frequent renter points";
                
        assertEquals(expected, statement);
    }
}