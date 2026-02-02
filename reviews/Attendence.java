import java.util.*;
class DuplicateAttendanceException extends Exception {
    public DuplicateAttendanceException(String msg) {
        super(msg);
    }
}
class AttendanceTracker {
    public Map<String, Set<String>> map = new HashMap<>();
    void mark(String session, String student) throws DuplicateAttendanceException {
        map.putIfAbsent(session, new HashSet<>());
        if (!map.get(session).add(student)){
            throw new DuplicateAttendanceException(student);
        }
    }
    void remove(String session, String student) {
        if (map.containsKey(session))
            map.get(session).remove(student);
    }
    void display() {
        System.out.println(map);
    }
}
public class Attendence {
    public static void main(String[] args) {
        AttendanceTracker t = new AttendanceTracker();
        try {
            t.mark("S1", "kartik");
            t.mark("S1", "priyanka");
            t.mark("S1", "hritk");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        t.display();
    }
}