class UnitConverter {

    static double kmToMiles(double km) { return km * 0.621371; }
    static double milesToKm(double m) { return m * 1.60934; }
    static double metersToFeet(double m) { return m * 3.28084; }
    static double feetToMeters(double f) { return f * 0.3048; }

    public static void main(String[] args) {
        System.out.println(kmToMiles(10));
        System.out.println(milesToKm(10));
    }
}
