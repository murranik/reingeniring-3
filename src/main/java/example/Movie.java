package example;

public class Movie {
    private final String title;
    private final double initialPrice;
    private final MovieType type;

    public Movie(String title, double pricePerDay, MovieType type) {
        this.title = title;
        this.initialPrice = pricePerDay;
        this.type = type;
    }

    public double getInitialPrice() {
        return initialPrice;
    }

    public String getTitle (){
        return title;
    }

    public MovieType getMovieType (){
        return type;
    }
}