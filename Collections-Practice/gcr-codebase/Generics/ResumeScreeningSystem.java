import java.util.*;
abstract class JobRole {
    abstract String getRole();
}
class SoftwareEngineer extends JobRole {
    String getRole() { return "Software Engineer"; }
}

class DataScientist extends JobRole {
    String getRole() { return "Data Scientist"; }
}

class ProductManager extends JobRole {
    String getRole() { return "Product Manager"; }
}
class Resume<T extends JobRole> {
    T role;
    Resume(T role) { this.role = role; }
}
class ScreeningUtil {
    public static void screen(List<? extends JobRole> list) {
        for (JobRole r : list)
            System.out.println("Screening resume for: " + r.getRole());
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        ScreeningUtil.screen(roles);
    }
}
