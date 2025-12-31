class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static int costPerDay = 1000;

    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    int totalCost() {
        return rentalDays * costPerDay;
    }
}
