import java.util.*;

interface Payment {
    void pay(double amount) throws PaymentFailedException;
}

class CardPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0)
            throw new PaymentFailedException("Card Payment Failed");
        System.out.println("Paid " + amount + " using Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0)
            throw new PaymentFailedException("UPI Payment Failed");
        System.out.println("Paid " + amount + " using UPI");
    }
}

class WalletPayment implements Payment {
    public void pay(double amount) throws PaymentFailedException {
        if (amount <= 0)
            throw new PaymentFailedException("Wallet Payment Failed");
        System.out.println("Paid " + amount + " using Wallet");
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class Order {
    int orderId;
    Product product;
    String status;

    Order(int orderId, Product product) {
        this.orderId = orderId;
        this.product = product;
        this.status = "Placed";
    }

    void cancelOrder() {
        status = "Cancelled";
        System.out.println("Order " + orderId + " cancelled.");
    }

    void trackOrder() {
        System.out.println("Order " + orderId + " Status: " + status);
    }
}

class Customer {
    int id;
    String name;

    Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void placeOrder(Product p, Payment payment) {
        try {
            Order o = new Order(101, p);
            payment.pay(p.price);
            System.out.println("Order Placed for: " + p.name);
            o.trackOrder();
        } catch (PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class EcommerceSystem {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 60000);
        Customer c1 = new Customer(1, "Kartik");

        Payment card = new CardPayment();
        Payment upi = new UPIPayment();

        c1.placeOrder(p1, card);
        c1.placeOrder(p1, upi);
    }
}
