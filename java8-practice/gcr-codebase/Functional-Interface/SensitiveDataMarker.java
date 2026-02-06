interface SensitiveData {}

class Employee implements SensitiveData {
    String salary = "Confidential";
}

class SecuritySystem {

    static void check(Object o) {
        if (o instanceof SensitiveData)
            System.out.println("Encrypt Data");
        else
            System.out.println("Normal Data");
    }
}

public class SensitiveDataMarker {
    public static void main(String[] args) {
        Employee e = new Employee();
        SecuritySystem.check(e);
    }
}
