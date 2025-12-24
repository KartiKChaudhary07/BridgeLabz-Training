class TigonometicFunction{

    static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{
                Math.sin(rad),
                Math.cos(rad),
                Math.tan(rad)
        };
    }

    public static void main(String[] args) {
        double angle = Double.parseDouble(args[0]);
        double[] res = calculateTrigonometricFunctions(angle);

        System.out.println("Sin = " + res[0]);
        System.out.println("Cos = " + res[1]);
        System.out.println("Tan = " + res[2]);
    }
}
