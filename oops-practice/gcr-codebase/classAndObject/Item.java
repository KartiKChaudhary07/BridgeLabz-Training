package classAndobject;
class Item {
    String itemCode, itemName;
    double price;

    void display() {
        System.out.println("itemCode : " + itemCode);
        System.out.println("itemPrice : " + price);
        System.out.println("itemName : " + itemName);
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Item i1 = new Item();
        i1.itemCode = "01AA";
        i1.itemName = "Water bottle";
        i1.price = 500;

        Item i2 = new Item();
        i2.itemCode = "01BB";
        i2.itemName = "Rice";
        i2.price = 700;

        Item i3 = new Item();
        i3.itemCode = "02AA";
        i3.itemName = "blackboard";
        i3.price = 400;

        i1.display();
        i2.display();
        i3.display();
    }
}
