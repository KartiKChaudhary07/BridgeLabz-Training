import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("destination.txt");

        try {
            if (!source.exists()) {
                System.out.println("Source file does not exist!");
                return;
            }

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            fis.close();
            fos.close();
            System.out.println("File copied successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
