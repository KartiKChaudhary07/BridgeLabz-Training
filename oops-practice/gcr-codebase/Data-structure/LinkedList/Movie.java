class Movie {
    String title, director;
    int year;
    double rating;
    Movie next, prev;

    Movie(String t, String d, int y, double r) {
        title=t; director=d; year=y; rating=r;
    }
}

class MovieList {
    Movie head, tail;

    void addEnd(String t,String d,int y,double r) {
        Movie m = new Movie(t,d,y,r);
        if (head == null) head = tail = m;
        else {
            tail.next = m;
            m.prev = tail;
            tail = m;
        }
    }

    void remove(String title) {
        Movie t = head;
        while (t != null) {
            if (t.title.equals(title)) {
                if (t.prev != null) t.prev.next = t.next;
                else head = t.next;
                if (t.next != null) t.next.prev = t.prev;
                else tail = t.prev;
                return;
            }
            t = t.next;
        }
    }

    void displayForward() {
        Movie t = head;
        while (t != null) {
            System.out.println(t.title+" "+t.rating);
            t = t.next;
        }
    }

    void displayReverse() {
        Movie t = tail;
        while (t != null) {
            System.out.println(t.title+" "+t.rating);
            t = t.prev;
        }
    }

    public static void main(String[] args) {
        MovieList m = new MovieList();
        m.addEnd("Inception","Nolan",2010,9.0);
        m.displayForward();
    }
}
