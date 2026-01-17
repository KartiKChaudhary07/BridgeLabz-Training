import java.io.*;

class WordCount {
    public static void main(String[] args) throws Exception {
        String word = "java";
        int count = 0;

        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String line;

        while((line = br.readLine()) != null) {
            String[] arr = line.split(" ");
            for(String s : arr) {
                if(s.equals(word)) count++;
            }
        }
        br.close();
        System.out.println("Count = " + count);
    }
}
