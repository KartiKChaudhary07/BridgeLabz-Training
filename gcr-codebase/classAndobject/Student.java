package classAndobject;
class Student {
    String name, rollNumber;
    double m1, m2, m3;

    char calculateGrade() {
        double avg = (m1 + m2 + m3) / 3;
        if (avg >= 75) return 'A';
        else if (avg >= 60) return 'B';
        else return 'C';
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Grade " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Thamarai";
        s1.rollNumber = "ECE001";
        s1.m1 = 80; s1.m2 = 70; s1.m3 = 75;
        s1.display();
    }
}
