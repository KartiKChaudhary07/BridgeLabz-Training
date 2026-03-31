import java.util.regex.*;

public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org";
        String regex = "https?://\\S+";

        Matcher m = Pattern.compile(regex).matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
