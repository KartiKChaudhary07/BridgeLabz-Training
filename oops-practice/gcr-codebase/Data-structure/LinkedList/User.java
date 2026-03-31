class User {
    int id;
    String name;
    int[] friends = new int[10];
    int count;
    User next;

    User(int i,String n){ id=i; name=n; }
}

class Social {
    User head;

    void addUser(int i,String n){
        User u=new User(i,n);
        u.next=head;
        head=u;
    }

    public static void main(String[] args){
        Social s=new Social();
        s.addUser(1,"A");
    }
}
