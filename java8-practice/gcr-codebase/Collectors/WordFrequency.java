import java.util.*;
import java.util.stream.*;

public class WordFrequency {
    public static void main(String[] args) {

        String text = "java is easy java is powerful";

        Map<String, Long> freq =
            Arrays.stream(text.split(" "))
                  .collect(Collectors.toMap(
                      word -> word,
                      word -> 1L,
                      Long::sum
                  ));

        System.out.println(freq);
    }
}
