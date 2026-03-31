import java.util.Scanner;

class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;
        System.out.print("Enter base: ");
        base = sc.nextDouble();
        System.out.print("Enter height: ");
        height = sc.nextDouble();

        double areaInches = 0.5 * base * height;
        double areaCm = areaInches * 6.4516;

        System.out.println("Area in square inches is " + areaInches +
                " and in square centimeters is " + areaCm);
    }
}
