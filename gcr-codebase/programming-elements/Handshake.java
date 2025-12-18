import java.util.Scanner;

class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents;
        System.out.print("Enter number of students: ");
        numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of handshakes is " + handshakes);
    }
}
