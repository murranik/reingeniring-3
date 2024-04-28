package example;

import java.util.Optional;

class Rental {
    private final Movie movie;
    private final Integer daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge() {
        final Movie movie = getMovie();

        double charge = movie.getInitialPrice();
        if (getDaysRented() > movie.getMovieType().getDaysForAdditionCharge()) {
            charge += movie.getMovieType().getAdditionalCharge().getAdditionalCharge(getDaysRented());
        }

        return charge;
    }

    public int getFrequentRenterPoints() {
        int frequentRenterPoint = 1;
        Optional<Integer> days = getMovie().getMovieType().getDaysForFrequentRenterPoint();

        if (days.isEmpty()) {
            return frequentRenterPoint;
        }

        boolean canGetAdditionPoints = days.isPresent() && getDaysRented().compareTo(days.get()) > 0;

        frequentRenterPoint += canGetAdditionPoints ? 1 : 0;

        return frequentRenterPoint;
    }

    public Integer getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}