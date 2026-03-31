abstract class FoodItem {
    protected double price;
    protected int quantity;

    abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem {
    public double calculateTotalPrice() {
        return price * quantity;
    }
}

class NonVegItem extends FoodItem {
    public double calculateTotalPrice() {
        return (price * quantity) + 50;
    }
}
class Beverage extends FoodItem implements Discountable {
    public double calculateTotalPrice() {
        return price * quantity;
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }
}