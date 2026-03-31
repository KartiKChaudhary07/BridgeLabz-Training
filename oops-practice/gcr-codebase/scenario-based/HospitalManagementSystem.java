import java.util.*;
interface IPayable {
    double calculateBill();
}
class Patient {
    private int id;
    private String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}
class InPatient extends Patient implements IPayable {
    private int days;
    private double dailyCharge;

    InPatient(int id, String name, int days, double charge) {
        super(id, name);
        this.days = days;
        this.dailyCharge = charge;
    }

    public double calculateBill() {
        return days * dailyCharge;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: InPatient");
        System.out.println("Bill Amount: " + calculateBill());
    }
}
class OutPatient extends Patient implements IPayable {
    private double consultationFee;

    OutPatient(int id, String name, double fee) {
        super(id, name);
        this.consultationFee = fee;
    }

    public double calculateBill() {
        return consultationFee;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Type: OutPatient");
        System.out.println("Bill Amount: " + calculateBill());
    }
}
public class HospitalManagementSystem {
    static List<Patient> patients = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void addPatient() {
        System.out.println("1. InPatient  2. OutPatient");
        int choice = sc.nextInt();

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        if (choice == 1) {
            System.out.print("Enter Days: ");
            int days = sc.nextInt();
            System.out.print("Enter Daily Charge: ");
            double charge = sc.nextDouble();

            patients.add(new InPatient(id, name, days, charge));
        } else {
            System.out.print("Enter Consultation Fee: ");
            double fee = sc.nextDouble();

            patients.add(new OutPatient(id, name, fee));
        }
        System.out.println("Patient Added Successfully");
    }

    static void viewPatients() {
        for (Patient p : patients) {
            p.displayInfo();
            System.out.println("-----------------");
        }
    }

    static void deletePatient() {
        System.out.print("Enter Patient ID to Delete: ");
        int id = sc.nextInt();

        patients.removeIf(p -> p.getId() == id);
        System.out.println("Patient Deleted");
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Add Patient\n2.View Patients\n3.Delete Patient\n4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: addPatient(); break;
                case 2: viewPatients(); break;
                case 3: deletePatient(); break;
                case 4: System.exit(0);
            }
        }
    }
}
