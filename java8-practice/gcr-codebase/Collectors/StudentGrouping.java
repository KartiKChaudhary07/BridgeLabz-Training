import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    String grade;

    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}

public class StudentGrouping {
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
            new Student("Ram", "A"),
            new Student("Shyam", "B"),
            new Student("Om", "A"),
            new Student("Raj", "B")
        );

        Map<String, List<String>> result =
            list.stream()
                .collect(Collectors.groupingBy(
                    Student::getGrade,
                    Collectors.mapping(
                        Student::getName,
                        Collectors.toList()
                    )
                ));

        System.out.println(result);
    }
}
