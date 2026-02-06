import java.util.function.Function;

public class StringLengthFunction {
    public static void main(String[] args) {
        Function<String,Integer> f = s -> s.length();
        System.out.println(f.apply("Hello Kartik"));
    }
}
