import java.util.*;
class SimpleIntrest{
    public static double calculateSimpleIntrest(double p,double r,double t){
        return (p*r*t)/100;
    }
    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double p = sc.nextDouble();
        System.out.println("Enter rate of interest:");
        double r = sc.nextDouble();
        System.out.println("Enter time period:");
        double t = sc.nextDouble();
        double si = calculateSimpleIntrest(p,r,t);
        System.out.println("Simple Interest is: " + si);
        sc.close();
    }
}