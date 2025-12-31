package classAndobject;
class CartItem {
    String itemName;
    double price;
    int quantity;

    void add(int q) {
        quantity += q;
        System.out.println("Added " + q + " of " + itemName);
    }

    void remove(int q) {
        quantity -= q;
        System.out.println("Removed " + q + " of " + itemName);
    }

    void totalCost() {
        System.out.println("Total cost: $" + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.itemName = "Laptop";
        c.price = 999.99;
        c.quantity = 1;

        c.add(2);
        c.remove(1);
        c.totalCost();
    }
}
