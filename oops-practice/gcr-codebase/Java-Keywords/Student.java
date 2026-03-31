class Student {

    static String universityName = "Global University";
    static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    void updateGrade(String newGrade) {
        grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Hemashree", "A");
        Student s2 = new Student(102, "Sharmila", "B");

        displayTotalStudents();
        s1.displayDetails();
        s2.displayDetails();
        s2.updateGrade("A");
        s2.displayDetails();
    }
}
