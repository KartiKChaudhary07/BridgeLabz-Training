class Process {
    int pid, burst;
    Process next;

    Process(int p,int b){ pid=p; burst=b; }
}

class RoundRobin {
    Process head;

    void add(int p,int b){
        Process pr=new Process(p,b);
        if(head==null){
            head=pr; pr.next=head;
        } else {
            Process t=head;
            while(t.next!=head) t=t.next;
            t.next=pr; pr.next=head;
        }
    }

    void execute(int tq){
        Process curr=head, prev=null;
        while(head!=null){
            if(curr.burst<=tq){
                System.out.println("Process "+curr.pid+" done");
                if(curr==curr.next){ head=null; break; }
                prev.next=curr.next;
                if(curr==head) head=curr.next;
                curr=prev.next;
            } else {
                curr.burst-=tq;
                prev=curr;
                curr=curr.next;
            }
        }
    }

    public static void main(String[] args){
        RoundRobin r=new RoundRobin();
        r.add(1,5); r.add(2,3);
        r.execute(2);
    }
}
