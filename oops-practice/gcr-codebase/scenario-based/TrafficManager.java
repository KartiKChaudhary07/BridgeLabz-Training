import java.util.*;

class Vehicle {
    String number;
    Vehicle next;

    Vehicle(String number) {
        this.number = number;
        this.next = null;
    }
}

class CircularLinkedList {
    private Vehicle head = null;

    void addVehicle(String number) {
        Vehicle newNode = new Vehicle(number);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    void removeVehicle(String number) {
        if (head == null) return;

        Vehicle curr = head, prev = null;

        do {
            if (curr.number.equals(number)) {
                if (prev != null) prev.next = curr.next;
                else {
                    Vehicle last = head;
                    while (last.next != head)
                        last = last.next;
                    head = curr.next;
                    last.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void display() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }
        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}

class VehicleQueue {
    Queue<String> queue = new LinkedList<>();
    int capacity = 5;

    void enqueue(String v) {
        if (queue.size() == capacity)
            System.out.println("Queue Overflow!");
        else
            queue.add(v);
    }

    String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow!");
            return null;
        }
        return queue.poll();
    }
}

public class TrafficManager {
    public static void main(String[] args) {
        CircularLinkedList roundabout = new CircularLinkedList();
        VehicleQueue waitingQueue = new VehicleQueue();

        waitingQueue.enqueue("Car1");
        waitingQueue.enqueue("Car2");
        waitingQueue.enqueue("Car3");

        roundabout.addVehicle(waitingQueue.dequeue());
        roundabout.addVehicle(waitingQueue.dequeue());

        roundabout.display();

        roundabout.addVehicle(waitingQueue.dequeue());
        roundabout.display();

        roundabout.removeVehicle("Car2");
        roundabout.display();
    }
}
