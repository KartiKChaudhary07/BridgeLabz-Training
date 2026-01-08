class Book {
    int id;
    String title;
    boolean available;
    Book next, prev;

    Book(int i,String t){
        id=i; title=t; available=true;
    }
}

class Library {
    Book head, tail;

    void add(int i,String t){
        Book b=new Book(i,t);
        if(head==null) head=tail=b;
        else{
            tail.next=b;
            b.prev=tail;
            tail=b;
        }
    }

    void display(){
        Book t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.title+" "+t.available);
            t=t.next;
        }
    }

    public static void main(String[] args){
        Library l=new Library();
        l.add(1,"Java");
        l.display();
    }
}
