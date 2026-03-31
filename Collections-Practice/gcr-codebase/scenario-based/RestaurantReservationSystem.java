import java.time.LocalDateTime;
import java.util.*;
class TableAlreadyReservedException extends Exception {
    public TableAlreadyReservedException(String message) {
        super(message);
    }
}
class Table {
    private int tableNumber;
    private int capacity;

    public Table(int tableNumber, int capacity) {
        this.tableNumber = tableNumber;
        this.capacity = capacity;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getCapacity() {
        return capacity;
    }
}
class Reservation {
    private int tableNumber;
    private String customerName;
    private LocalDateTime timeSlot;

    public Reservation(int tableNumber, String customerName, LocalDateTime timeSlot) {
        this.tableNumber = tableNumber;
        this.customerName = customerName;
        this.timeSlot = timeSlot;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public LocalDateTime getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Table " + tableNumber + " reserved by " + customerName + " at " + timeSlot;
    }
}
public class RestaurantReservationSystem {

    private Map<Integer, Table> tables = new HashMap<>();
    private List<Reservation> reservations = new ArrayList<>();

    public void addTable(Table table) {
        tables.put(table.getTableNumber(), table);
    }

    public void reserveTable(int tableNo, String name, LocalDateTime time)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.getTableNumber() == tableNo && r.getTimeSlot().equals(time)) {
                throw new TableAlreadyReservedException("Table already reserved for this time slot!");
            }
        }

        reservations.add(new Reservation(tableNo, name, time));
        System.out.println("Reservation successful for Table " + tableNo);
    }

    public void cancelReservation(int tableNo, LocalDateTime time) {
        reservations.removeIf(r -> r.getTableNumber() == tableNo && r.getTimeSlot().equals(time));
        System.out.println("Reservation cancelled for Table " + tableNo);
    }

    public void showAvailableTables(LocalDateTime time) {
        System.out.println("Available Tables at " + time + ":");
        for (Table t : tables.values()) {
            boolean booked = false;
            for (Reservation r : reservations) {
                if (r.getTableNumber() == t.getTableNumber() && r.getTimeSlot().equals(time)) {
                    booked = true;
                    break;
                }
            }
            if (!booked) {
                System.out.println("Table " + t.getTableNumber() + " (Capacity: " + t.getCapacity() + ")");
            }
        }
    }

    public static void main(String[] args) {
        try {
            RestaurantReservationSystem system = new RestaurantReservationSystem();

            system.addTable(new Table(1, 4));
            system.addTable(new Table(2, 2));
            system.addTable(new Table(3, 6));

            LocalDateTime time = LocalDateTime.of(2026, 1, 30, 19, 0);

            system.reserveTable(1, "Kartik", time);
            system.reserveTable(2, "Rahul", time);

            system.showAvailableTables(time);

            system.reserveTable(1, "Amit", time);

        } catch (TableAlreadyReservedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
