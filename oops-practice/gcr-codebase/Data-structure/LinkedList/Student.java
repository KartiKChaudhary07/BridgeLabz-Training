class Student {
    int roll, age;
    String name, grade;
    Student next;

    Student(int r, String n, int a, String g) {
        roll = r; name = n; age = a; grade = g;
        next = null;
    }
}

class StudentList {
    Student head;

    void addEnd(int r, String n, int a, String g) {
        Student s = new Student(r, n, a, g);
        if (head == null) head = s;
        else {
            Student t = head;
            while (t.next != null) t = t.next;
            t.next = s;
        }
    }

    void delete(int roll) {
        if (head == null) return;
        if (head.roll == roll) {
            head = head.next; return;
        }
        Student t = head;
        while (t.next != null && t.next.roll != roll) t = t.next;
        if (t.next != null) t.next = t.next.next;
    }

    void search(int roll) {
        Student t = head;
        while (t != null) {
            if (t.roll == roll) {
                System.out.println(t.roll+" "+t.name+" "+t.grade);
                return;
            }
            t = t.next;
        }
        System.out.println("Not Found");
    }

    void updateGrade(int roll, String g) {
        Student t = head;
        while (t != null) {
            if (t.roll == roll) { t.grade = g; return; }
            t = t.next;
        }
    }

    void display() {
        Student t = head;
        while (t != null) {
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t = t.next;
        }
    }

    public static void main(String[] args) {
        StudentList l = new StudentList();
        l.addEnd(1,"Aman",20,"A");
        l.addEnd(2,"Ravi",21,"B");
        l.display();
    }
}
