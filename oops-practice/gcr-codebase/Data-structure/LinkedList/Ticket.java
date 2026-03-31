class Ticket {
    int id;
    String customer;
    Ticket next;

    Ticket(int i,String c){
        id=i; customer=c;
    }
}

class TicketSystem {
    Ticket head;

    void add(int i,String c){
        Ticket t=new Ticket(i,c);
        if(head==null){
            head=t; t.next=head;
        } else {
            Ticket temp=head;
            while(temp.next!=head) temp=temp.next;
            temp.next=t;
            t.next=head;
        }
    }

    void display(){
        if(head==null) return;
        Ticket t=head;
        do{
            System.out.println(t.id+" "+t.customer);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        TicketSystem ts=new TicketSystem();
        ts.add(1,"Aman");
        ts.display();
    }
}
