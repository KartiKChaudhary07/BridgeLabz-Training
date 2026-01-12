import java.util.*;

interface PricingStrategy {
    double calculatePrice(int days, double baseRate);
}

class NormalPricing implements PricingStrategy {
    public double calculatePrice(int days, double baseRate) {
        return days * baseRate;
    }
}

class SeasonalPricing implements PricingStrategy {
    public double calculatePrice(int days, double baseRate) {
        return days * baseRate * 1.5; // 50% extra in season
    }
}

class RoomNotAvailableException extends Exception {
    public RoomNotAvailableException(String msg) {
        super(msg);
    }
}

class Room {
    int roomNo;
    double rate;
    boolean isAvailable = true;

    Room(int roomNo, double rate) {
        this.roomNo = roomNo;
        this.rate = rate;
    }
}

class StandardRoom extends Room {
    StandardRoom(int roomNo) {
        super(roomNo, 2000);
    }
}

class DeluxeRoom extends Room {
    DeluxeRoom(int roomNo) {
        super(roomNo, 4000);
    }
}

class Guest {
    int id;
    String name;

    Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Reservation {
    Room room;
    Guest guest;
    int days;

    Reservation(Room room, Guest guest, int days) {
        this.room = room;
        this.guest = guest;
        this.days = days;
    }

    void checkIn() throws RoomNotAvailableException {
        if (!room.isAvailable)
            throw new RoomNotAvailableException("Room is not available!");
        room.isAvailable = false;
        System.out.println("Check-in successful for " + guest.name);
    }

    void checkOut(PricingStrategy strategy) {
        room.isAvailable = true;
        double bill = strategy.calculatePrice(days, room.rate);
        System.out.println("Check-out successful for " + guest.name);
        System.out.println("Total Bill: Rs." + bill);
    }
}

public class HotelReservationSystem {
    public static void main(String[] args) {
        try {
            Room r1 = new DeluxeRoom(101);
            Guest g1 = new Guest(1, "Kartik");

            Reservation res = new Reservation(r1, g1, 3);
            res.checkIn();

            PricingStrategy seasonal = new SeasonalPricing();
            res.checkOut(seasonal);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
