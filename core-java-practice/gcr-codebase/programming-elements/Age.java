//write a program to find age of harry if the birth year is 2000.Assume the current year is 2024 

class Age {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println("Harry's age is: " + age);
    }
}
