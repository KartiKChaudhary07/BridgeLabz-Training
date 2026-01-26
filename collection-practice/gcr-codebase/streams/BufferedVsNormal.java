import java.io.*;

public class BufferedVsNormal {
    public static void main(String[] args) throws IOException {

        File input = new File("bigfile.dat");
        File output1 = new File("normalCopy.dat");
        File output2 = new File("bufferedCopy.dat");

        // Normal Streams
        long start1 = System.nanoTime();
        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output1);

        byte[] buffer = new byte[4096];
        int bytesRead;
        while ((bytesRead = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }
        fis.close();
        fos.close();
        long end1 = System.nanoTime();

        // Buffered Streams
        long start2 = System.nanoTime();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(input));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(output2));

        while ((bytesRead = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        bis.close();
        bos.close();
        long end2 = System.nanoTime();

        System.out.println("Normal Time: " + (end1 - start1));
        System.out.println("Buffered Time: " + (end2 - start2));
    }
}
