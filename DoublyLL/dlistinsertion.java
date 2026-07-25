public class dlistinsertion{
    static class node{
    int data;
    node next;
    node pre;
    node(int data){
        this.data=data;
        this.pre=null;
        this.next=null;
    }
}
    static node insertatfront(node head,int data){
        node newnode=new node(data);
        if(head==null){
            return newnode;
        }
        node temp=head;
        newnode.next=temp;
        temp.pre=newnode;
        return newnode;
    }
    static node insertatlast(node head,int data){
        node newnode=new node(data);
        if(head==null){
            return newnode;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.pre=temp;
        temp=newnode;
        return head;
    }
    static node insertatindex(node head,int data,int index){
        node newnode=new node(data);
        if(head==null){
            return newnode;
        }
        int count=0;
        node temp=head;
        while(temp!=null && count<index-1){
            temp=temp.next;
            count+=1;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        newnode.pre=temp;
        return head;
    }
    static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node head=new node(10);
        head=insertatfront(head, 100);
        head=insertatfront(head, 20);
        head=insertatlast(head, 25);
        head=insertatindex(head, 2000, 2);
        print(head);
    }
}
