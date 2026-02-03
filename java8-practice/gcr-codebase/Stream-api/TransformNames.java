import java.util.*;

public class TransformNames {
    public static void main(String[] args) {

        List<String> names = List.of("kartik", "aman", "rohit");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
