import java.util.Scanner;
class HandShakes{
    public static int calculatehandshakes(int n){
        return (n*(n-1))/2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people:");
        int n = sc.nextInt();
        int handshakes = calculatehandshakes(n);
        System.out.println("Total handshakes: " + handshakes);
        sc.close();
    }
}