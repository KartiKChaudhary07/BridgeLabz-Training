import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String t, double a) {
        type=t; amount=a;
    }
}

public class InsuranceClaims {
    public static void main(String[] args) {

        List<Claim> claims = List.of(
            new Claim("Health", 5000),
            new Claim("Health", 7000),
            new Claim("Vehicle", 12000)
        );

        Map<String, Double> avgClaims =
            claims.stream()
                  .collect(Collectors.groupingBy(
                      c -> c.type,
                      Collectors.averagingDouble(c -> c.amount)
                  ));

        System.out.println(avgClaims);
    }
}
