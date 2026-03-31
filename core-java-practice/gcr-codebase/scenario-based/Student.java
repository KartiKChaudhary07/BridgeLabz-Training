import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String msg) {
        super(msg);
    }
}
class Student {
    String name;
    String[] subjects;
    int[] marks;

    Student(String name, String[] subjects, int[] marks)
            throws InvalidMarkException {

        for (int m : marks)
            if (m < 0 || m > 100)
                throw new InvalidMarkException("Marks must be between 0 and 100");

        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
    }

    double average() {
        int sum = 0;
        for (int m : marks) sum += m;
        return sum / (double) marks.length;
    }

    String grade() {
        double avg = average();
        if (avg >= 75) return "A";
        if (avg >= 60) return "B";
        return "C";
    }

    void display() {
        System.out.println("\n--- Report Card ---");
        System.out.println("Name: " + name);
        for (int i = 0; i < subjects.length; i++)
            System.out.println(subjects[i] + ": " + marks[i]);
        System.out.println("Average: " + average());
        System.out.println("Grade: " + grade());
    }
}

class ReportGenerator {
    public static void main(String[] args) throws Exception {
        List<Student> students = new ArrayList<>();

        String[] subjects = {"Math", "Science", "English"};
        int[] marks = {80, 70, 90};

        students.add(new Student("Rahul", subjects, marks));

        for (Student s : students)
            s.display();
    }
}
