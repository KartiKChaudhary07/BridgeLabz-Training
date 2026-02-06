interface VehicleRental {
    void rent();
    void returnVehicle();
}

class Car implements VehicleRental {
    public void rent() { System.out.println("Car Rented"); }
    public void returnVehicle() { System.out.println("Car Returned"); }
}

class Bike implements VehicleRental {
    public void rent() { System.out.println("Bike Rented"); }
    public void returnVehicle() { System.out.println("Bike Returned"); }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        VehicleRental v = new Car();
        v.rent();
        v.returnVehicle();
    }
}
