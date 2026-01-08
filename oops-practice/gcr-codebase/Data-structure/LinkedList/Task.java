class Task {
    int id, priority;
    String name;
    Task next;

    Task(int i,String n,int p) {
        id=i; name=n; priority=p;
    }
}

class TaskScheduler {
    Task head;

    void add(int i,String n,int p) {
        Task t = new Task(i,n,p);
        if (head == null) {
            head = t; t.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t;
            t.next = head;
        }
    }

    void display() {
        if (head == null) return;
        Task t = head;
        do {
            System.out.println(t.id+" "+t.name);
            t = t.next;
        } while (t != head);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.add(1,"Job",1);
        ts.add(2,"Study",2);
        ts.display();
    }
}
