import java.util.Scanner;

class BMI {

    static void calculateBMI(double[][] data) {
        for (int i = 0; i < 10; i++) {
            double h = data[i][1] / 100;
            data[i][2] = data[i][0] / (h * h);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }

        calculateBMI(data);

        for (int i = 0; i < 10; i++)
            System.out.println("BMI = " + data[i][2]);

        sc.close();
    }
}
