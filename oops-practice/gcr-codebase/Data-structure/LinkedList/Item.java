class Item {
    int id, qty;
    String name;
    double price;
    Item next;

    Item(int i,String n,int q,double p){
        id=i; name=n; qty=q; price=p;
    }
}

class Inventory {
    Item head;

    void add(int i,String n,int q,double p){
        Item it = new Item(i,n,q,p);
        it.next = head;
        head = it;
    }

    void totalValue(){
        double sum=0;
        Item t=head;
        while(t!=null){
            sum += t.qty * t.price;
            t=t.next;
        }
        System.out.println("Total = "+sum);
    }

    public static void main(String[] args){
        Inventory in=new Inventory();
        in.add(1,"Pen",10,5);
        in.totalValue();
    }
}
