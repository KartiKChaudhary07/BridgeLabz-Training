import java.io.*;
import java.util.*;

public class SerializationDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Amit", "IT", 50000));
        list.add(new Employee(2, "Neha", "HR", 45000));

        try {
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("emp.dat"));
            oos.writeObject(list);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("emp.dat"));
            List<Employee> empList = (List<Employee>) ois.readObject();

            for (Employee e : empList) {
                System.out.println(e.id + " " + e.name + " " + e.department + " " + e.salary);
            }
            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
