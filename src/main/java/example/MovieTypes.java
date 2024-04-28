package example;

public class MovieTypes {
        public static MovieType regular = new MovieType(
                        "Regular",
                        2,
                        null,
                        2,
                        new AdditionalCharge() {
                                @Override
                                public double getAdditionalCharge(double daysRented) {
                                        return (daysRented - 2) * 1.5;
                                }
                        });
        public static MovieType new_release = new MovieType(
                        "New Release",
                        0,
                        1,
                        0,
                        new AdditionalCharge() {
                                @Override
                                public double getAdditionalCharge(double daysRented) {
                                        return daysRented * 3;
                                }
                        });
        public static MovieType children = new MovieType(
                        "Children",
                        1.5,
                        null,
                        3,
                        new AdditionalCharge() {
                                @Override
                                public double getAdditionalCharge(double daysRented) {

                                        return (daysRented - 3) * 1.5;
                                }
                        });
        public static MovieType horror = new MovieType(
                        "Horror",
                        3,
                        7,
                        3,
                        new AdditionalCharge() {
                                @Override
                                public double getAdditionalCharge(double daysRented) {
                                        return daysRented * 3;
                                }
                        });
}