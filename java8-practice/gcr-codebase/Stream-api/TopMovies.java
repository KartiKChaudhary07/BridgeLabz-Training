import java.util.*;
import java.util.stream.*;

class Movie {
    String name;
    double rating;
    int year;

    Movie(String n, double r, int y) {
        name = n; rating = r; year = y;
    }
}

public class TopMovies {
    public static void main(String[] args) {

        List<Movie> movies = List.of(
            new Movie("Movie A", 9.1, 2024),
            new Movie("Movie B", 8.5, 2023),
            new Movie("Movie C", 9.5, 2025),
            new Movie("Movie D", 8.9, 2024),
            new Movie("Movie E", 9.0, 2022),
            new Movie("Movie F", 9.3, 2025)
        );

        movies.stream()
              .filter(m -> m.year >= 2023)
              .sorted((a, b) -> Double.compare(b.rating, a.rating))
              .limit(5)
              .forEach(m -> System.out.println(m.name + " " + m.rating));
    }
}
