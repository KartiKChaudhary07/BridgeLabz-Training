interface PaymentProcessor {

    void pay(double amt);

    default void refund(double amt) {
        System.out.println("Refund: " + amt);
    }
}

class Razorpay implements PaymentProcessor {
    public void pay(double amt) {
        System.out.println("Paid via Razorpay");
    }
}

public class PaymentProcessorDefault {
    public static void main(String[] args) {
        PaymentProcessor p = new Razorpay();
        p.pay(1000);
        p.refund(500);
    }
}
