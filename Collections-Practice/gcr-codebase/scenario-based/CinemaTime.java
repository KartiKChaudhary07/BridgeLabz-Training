import java.util.*;
class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}

public class CinemaTime {

    private List<String> movieTitles = new ArrayList<>();
    private List<String> showTimes = new ArrayList<>();
    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!time.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
            throw new InvalidTimeFormatException("Invalid Time Format: " + time);
        }
        movieTitles.add(title);
        showTimes.add(time);
    }

    public void searchMovie(String keyword) {
        try {
            for (int i = 0; i < movieTitles.size(); i++) {
                if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(movieTitles.get(i) + " at " + showTimes.get(i));
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index accessed during search.");
        }
    }
    public void displayAllMovies() {
        for (int i = 0; i < movieTitles.size(); i++) {
            String output = String.format("Movie: %s | Time: %s", movieTitles.get(i), showTimes.get(i));
            System.out.println(output);
        }
    }
    public void generateReport() {
        String[] titlesArray = movieTitles.toArray(new String[0]);
        String[] timesArray = showTimes.toArray(new String[0]);

        System.out.println("\n--- Printable Report ---");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i] + " - " + timesArray[i]);
        }
    }

    public static void main(String[] args) {
        CinemaTime cinema = new CinemaTime();

        try {
            cinema.addMovie("Inception", "18:30");
            cinema.addMovie("Avengers", "21:00");
            cinema.addMovie("Interstellar", "25:99"); // Will throw exception
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        cinema.displayAllMovies();
        cinema.searchMovie("in");
        cinema.generateReport();
    }
}
