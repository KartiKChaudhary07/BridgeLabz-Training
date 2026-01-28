import java.util.PriorityQueue;

// Custom Exception
class InvalidBackupPathException extends Exception {
    public InvalidBackupPathException(String message) {
        super(message);
    }
}

// BackupTask class implementing Comparable
class BackupTask implements Comparable<BackupTask> {
    private String folderPath;
    private int priority; // Higher value = Higher priority

    public BackupTask(String folderPath, int priority) {
        this.folderPath = folderPath;
        this.priority = priority;
    }

    public String getFolderPath() {
        return folderPath;
    }

    @Override
    public int compareTo(BackupTask other) {
        return Integer.compare(other.priority, this.priority); // Descending order
    }

    @Override
    public String toString() {
        return "Backup Task -> Folder: " + folderPath + ", Priority: " + priority;
    }
}

// Main Scheduler Class
public class FileBackupScheduler {

    private PriorityQueue<BackupTask> queue = new PriorityQueue<>();

    public void addBackupTask(BackupTask task) throws InvalidBackupPathException {
        if (task.getFolderPath() == null || task.getFolderPath().isEmpty()) {
            throw new InvalidBackupPathException("Invalid backup folder path!");
        }
        queue.add(task);
        System.out.println("Task added: " + task);
    }

    public void executeBackups() {
        System.out.println("\nExecuting Backups in Priority Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    // Main Method
    public static void main(String[] args) {
        try {
            FileBackupScheduler scheduler = new FileBackupScheduler();

            scheduler.addBackupTask(new BackupTask("C:/ImportantDocs", 5));
            scheduler.addBackupTask(new BackupTask("D:/Projects", 3));
            scheduler.addBackupTask(new BackupTask("E:/Movies", 1));

            scheduler.executeBackups();

        } catch (InvalidBackupPathException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
