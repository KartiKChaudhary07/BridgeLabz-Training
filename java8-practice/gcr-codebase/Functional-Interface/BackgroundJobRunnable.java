public class BackgroundJobRunnable {
    public static void main(String[] args) {

        Runnable job = () ->
            System.out.println("Background Job Running");

        new Thread(job).start();
    }
}
