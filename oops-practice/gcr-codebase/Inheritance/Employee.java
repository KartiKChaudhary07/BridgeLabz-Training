class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println(name + " | " + id + " | " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int durationMonths;

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationMonths);
    }
}