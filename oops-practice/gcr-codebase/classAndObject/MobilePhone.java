package classAndobject;
class MobilePhone {
    String brand, model;
    double price;

    void display() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone();
        m1.brand = "VIVO";
        m1.model = "VIVO V29";
        m1.price = 15999;

        MobilePhone m2 = new MobilePhone();
        m2.brand = "ONE PLUS";
        m2.model = "ONE PLUS nord4";
        m2.price = 39999;

        MobilePhone m3 = new MobilePhone();
        m3.brand = "APPLE";
        m3.model = "iphone pro16";
        m3.price = 79999;

        m1.display();
        m2.display();
        m3.display();
    }
}
