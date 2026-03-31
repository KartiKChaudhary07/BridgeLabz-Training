import java.util.*;
class InvalidFlightException extends Exception {

    public InvalidFlightException(String message) {
        super(message);
    }
}
class FlightUtil {
    public boolean validateFlightNumber(String flightNumber)
            throws InvalidFlightException {

        if (!flightNumber.matches("FL-[1-9][0-9]{3}")) {
            throw new InvalidFlightException(
                "The flight number " + flightNumber + " is invalid"
            );
        }
        return true;
    }
    public boolean validateFlightName(String flightName)
            throws InvalidFlightException {

        if (!(flightName.equals("SpiceJet") ||
              flightName.equals("Vistara") ||
              flightName.equals("IndiGo") ||
              flightName.equals("Air Arabia"))) {

            throw new InvalidFlightException(
                "The flight name " + flightName + " is invalid"
            );
        }
        return true;
    }
    public boolean validatePassengerCount(int passengerCount,
                                          String flightName)
            throws InvalidFlightException {

        int max = 0;

        switch (flightName) {
            case "SpiceJet": max = 396; break;
            case "Vistara": max = 615; break;
            case "IndiGo": max = 230; break;
            case "Air Arabia": max = 130; break;
        }

        if (passengerCount <= 0 || passengerCount > max) {
            throw new InvalidFlightException(
                "The passenger count " + passengerCount +
                " is invalid for " + flightName
            );
        }

        return true;
    }
    public double calculateFuelToFillTank(String flightName,
                                          double currentFuelLevel)
            throws InvalidFlightException {

        double capacity = 0;

        switch (flightName) {
            case "SpiceJet": capacity = 200000; break;
            case "Vistara": capacity = 300000; break;
            case "IndiGo": capacity = 250000; break;
            case "Air Arabia": capacity = 150000; break;
        }

        if (currentFuelLevel < 0 || currentFuelLevel > capacity) {
            throw new InvalidFlightException(
                "Invalid fuel level for " + flightName
            );
        }

        return capacity - currentFuelLevel;
    }
}
public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FlightUtil util = new FlightUtil();

        System.out.println("Enter flight details");

        String input = sc.nextLine();

        try {

            String[] data = input.split(":");

            String flightNumber = data[0];
            String flightName = data[1];
            int passengerCount =
                Integer.parseInt(data[2]);
            double currentFuelLevel =
                Double.parseDouble(data[3]);

            util.validateFlightNumber(flightNumber);
            util.validateFlightName(flightName);
            util.validatePassengerCount(
                passengerCount, flightName
            );

            double fuel =
                util.calculateFuelToFillTank(
                    flightName, currentFuelLevel
                );

            System.out.println(
                "Fuel required to fill the tank: "
                + fuel + " liters"
            );

        } catch (InvalidFlightException e) {
            System.out.println(e.getMessage());
        }
    }
}
