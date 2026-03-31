import java.util.*;

interface AlertService {
    void lowStockAlert(Product p);
}

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}

class Inventory implements AlertService {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product p) {
        products.put(p.id, p);
        System.out.println("Product added: " + p.name);
    }

    public void updateStock(int productId, int qty) throws OutOfStockException {
        Product p = products.get(productId);
        if (p == null || qty <= 0)
            throw new OutOfStockException("Product is out of stock!");

        p.quantity = qty;
        System.out.println("Stock updated for " + p.name + ": " + qty);

        if (qty < 5)
            lowStockAlert(p);
    }

    public void viewStock() {
        System.out.println("\nCurrent Inventory:");
        for (Product p : products.values()) {
            System.out.println(p.id + " " + p.name + " -> " + p.quantity);
        }
    }

    public void lowStockAlert(Product p) {
        System.out.println("ALERT: Low stock for " + p.name + " (Qty: " + p.quantity + ")");
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        try {
            Inventory inv = new Inventory();

            Product p1 = new Product(1, "Keyboard", 10);
            Product p2 = new Product(2, "Mouse", 3);

            inv.addProduct(p1);
            inv.addProduct(p2);

            inv.viewStock();

            inv.updateStock(1, 8);
            inv.updateStock(2, 2);   // Low stock alert

            inv.viewStock();

        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }
}
