class NoDriverAvailableException extends Exception {
    public NoDriverAvailableException(String msg) {
        super(msg);
    }
}

interface FareCalculator {
    double calculateFare(double distance);
}

class NormalFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 10;
    }
}

class PeakFareCalculator implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 15;
    }
}

class User {
    int id;
    String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Driver {
    int id;
    String name;
    boolean available = true;

    Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Ride {
    User user;
    Driver driver;
    double fare;

    Ride(User user, Driver driver, double fare) {
        this.user = user;
        this.driver = driver;
        this.fare = fare;
    }

    void showRide() {
        System.out.println("User: " + user.name);
        System.out.println("Driver: " + driver.name);
        System.out.println("Fare: ₹" + fare);
    }
}

public class CabBookingSystem {
    public static void main(String[] args) {
        try {
            User u1 = new User(1, "Priyanka");
            Driver d1 = new Driver(101, "Rahul");

            FareCalculator calculator = new PeakFareCalculator();

            if (!d1.available) {
                throw new NoDriverAvailableException("No driver available");
            }

            d1.available = false;
            double fare = calculator.calculateFare(12);

            Ride ride = new Ride(u1, d1, fare);
            ride.showRide();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}