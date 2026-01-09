import java.util.*;
interface IRentable {
    double calculateRent(int days);
}
class Vehicle {
    protected String vehicleNo;
    protected double ratePerDay;

    Vehicle(String vehicleNo, double ratePerDay) {
        this.vehicleNo = vehicleNo;
        this.ratePerDay = ratePerDay;
    }

    void display() {
        System.out.println("Vehicle No: " + vehicleNo);
    }
}
class Car extends Vehicle implements IRentable {
    Car(String no, double rate) {
        super(no, rate);
    }

    public double calculateRent(int days) {
        return ratePerDay * days;
    }
}

class Bike extends Vehicle implements IRentable {
    Bike(String no, double rate) {
        super(no, rate);
    }

    public double calculateRent(int days) {
        return ratePerDay * days;
    }
}

class Truck extends Vehicle implements IRentable {
    Truck(String no, double rate) {
        super(no, rate);
    }

    public double calculateRent(int days) {
        return ratePerDay * days * 1.5;
    }
}
public class VehicleRentalApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IRentable car = new Car("CAR101", 1500);
        IRentable bike = new Bike("BIKE202", 500);
        IRentable truck = new Truck("TRUCK303", 3000);

        System.out.print("Enter days: ");
        int days = sc.nextInt();

        System.out.println("Car Rent: " + car.calculateRent(days));
        System.out.println("Bike Rent: " + bike.calculateRent(days));
        System.out.println("Truck Rent: " + truck.calculateRent(days));
    }
}
