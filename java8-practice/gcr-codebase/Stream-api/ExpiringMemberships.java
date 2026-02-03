import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String n, LocalDate e) {
        name=n; expiry=e;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {

        List<Member> members = List.of(
            new Member("A", LocalDate.now().plusDays(10)),
            new Member("B", LocalDate.now().plusDays(40))
        );

        members.stream()
               .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
               .forEach(m -> System.out.println(m.name));
    }
}
