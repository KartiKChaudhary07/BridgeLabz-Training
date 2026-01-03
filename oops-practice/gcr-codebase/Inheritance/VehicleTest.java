class Vehicle {
    int maxSpeed;
    String fuelType;

    void displayInfo() {
        System.out.println(maxSpeed + " km/h | " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    @Override
    void displayInfo() {
        System.out.println("Car: " + seatCapacity + " seats");
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    @Override
    void displayInfo() {
        System.out.println("Truck Load: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    @Override
    void displayInfo() {
        System.out.println("Motorcycle | Gear: " + hasGear);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(),
            new Truck(),
            new Motorcycle()
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}