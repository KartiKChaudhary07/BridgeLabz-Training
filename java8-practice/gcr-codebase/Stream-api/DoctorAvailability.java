import java.util.*;

class Doctor {
    String name, specialty;
    boolean weekendAvailable;

    Doctor(String n, String s, boolean w) {
        name=n; specialty=s; weekendAvailable=w;
    }
}

public class DoctorAvailability {
    public static void main(String[] args) {

        List<Doctor> doctors = List.of(
            new Doctor("A", "Cardio", true),
            new Doctor("B", "Ortho", false),
            new Doctor("C", "Neuro", true)
        );

        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(d -> System.out.println(d.name + " " + d.specialty));
    }
}
