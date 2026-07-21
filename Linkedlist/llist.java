class node{
        int d;
        node next;
        node(int d){
            this.d=d;
            this.next=null;
        }
}
public class llist {
    static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.d+" ");
            temp=temp.next;
        }
    }
    static node insertdata(int data,node head){
        node newnode=new node(data);
        newnode.next=head;
        return newnode;
    }
public static void main(String args[]){
    node head=new node(10);
    head=insertdata(20, head);
    head=insertdata(30, head);
    head=insertdata(40, head);
    head=insertdata(50, head);
    print(head);
}
}