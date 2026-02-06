import java.util.function.Predicate;

public class TemperatureAlertPredicate {
    public static void main(String[] args) {
        Predicate<Double> alert = t -> t > 40;
        System.out.println(alert.test(35.0));
        System.out.println(alert.test(45.0));
    }
}
