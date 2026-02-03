import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = List.of("Kartik", "Aman", "Rohit");
        attendees.forEach(a -> System.out.println("Welcome " + a));
    }
}
