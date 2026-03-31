public class NestedTryDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int index = 5;
        int div = 0;

        try {
            try {
                System.out.println(arr[index] / div);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
    }
}
