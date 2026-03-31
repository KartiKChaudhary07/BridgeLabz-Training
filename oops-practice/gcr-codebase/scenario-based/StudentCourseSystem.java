import java.util.*;

interface RegistrationService {
    void enrollCourse(String course) throws CourseLimitExceededException;
    void dropCourse(String course);
    void showCourses();
}

class CourseLimitExceededException extends Exception {
    public CourseLimitExceededException(String msg) {
        super(msg);
    }
}

class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person implements RegistrationService {
    private int id;
    private List<String> courses = new ArrayList<>();
    private Map<String, String> grades = new HashMap<>();
    private final int MAX_COURSES = 3;

    Student(int id, String name, int age) {
        super(name, age);
        this.id = id;
    }

    public void enrollCourse(String course) throws CourseLimitExceededException {
        if (courses.size() >= MAX_COURSES)
            throw new CourseLimitExceededException("Course limit exceeded!");
        courses.add(course);
        grades.put(course, "Not Graded");
        System.out.println("Enrolled in: " + course);
    }

    public void dropCourse(String course) {
        courses.remove(course);
        grades.remove(course);
        System.out.println("Dropped: " + course);
    }

    public void assignGrade(String course, String grade) {
        if (grades.containsKey(course)) {
            grades.put(course, grade);
        }
    }

    public void showCourses() {
        System.out.println("Courses & Grades:");
        for (String c : courses) {
            System.out.println(c + " -> " + grades.get(c));
        }
    }
}

public class StudentCourseSystem {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(101, "Kartik", 20);

            s1.enrollCourse("Java");
            s1.enrollCourse("DBMS");
            s1.enrollCourse("OS");


            s1.assignGrade("Java", "A");
            s1.assignGrade("DBMS", "B+");

            s1.showCourses();

            s1.dropCourse("OS");
            s1.showCourses();

        } catch (CourseLimitExceededException e) {
            System.out.println(e.getMessage());
        }
    }
}
