import java.util.*;

public class StockLogger {
    public static void main(String[] args) {

        List<Double> prices = List.of(120.5, 121.8, 119.4);
        prices.forEach(p -> System.out.println("Stock Price: " + p));
    }
}
