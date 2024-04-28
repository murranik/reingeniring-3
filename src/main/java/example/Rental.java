package example;

class Rental {
    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public double getCharge(){
        final Movie movie = getMovie();

        double charge = movie.getInitialPrice();
        if (getDaysRented() > movie.getMovieType().getDaysForAdditionCharge()) {
            charge += movie.getMovieType().getAdditionalCharge().getAdditionalCharge(getDaysRented());
        }

        return charge;  
    }

    public int getFrequentRenterPoints() {
        return getDaysRented() > getMovie().getMovieType().getDaysForfrequentRenterPoint() ? 2 : 1;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }
}

    // private double calculateAmount(Rental rental) {
    //     double charge = 0;
    //     switch (rental.getMovie().getPriceCode()) {
    //         case REGULAR:
    //             charge += 2;
    //             if (rental.getDaysRented() > 2) {
    //                 charge += (rental.getDaysRented() - 2) * 1.5;
    //             }
    //             break;
    //         case NEW_RELEASE: {
    //                 charge += rental.getDaysRented() * 3;
    //             }
    //             break;
    //         case CHILDRENS:
    //             charge += 1.5;
    //             if (rental.getDaysRented() > 3) {
    //                 charge += (rental.getDaysRented() - 3) * 1.5;
    //             }
    //             break;
    //         case HORROR:
    //             charge += 3;
    //             if (rental.getDaysRented() > 7) {
    //                 charge += (rental.getDaysRented() - 7) * 2;
    //             }
    //             break;
    //     }
    //     return charge;
    // }
