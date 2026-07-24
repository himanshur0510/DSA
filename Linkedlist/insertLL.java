class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insertLL {
    static node insertll(int data,node head){
        node newnode=new node (data);
        if(head!=null){
            newnode.next=head;
            return newnode;
        }
        else{
            head=newnode;
            return head;
        }
    }
    static node insertatlast(node head,int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return head;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    static node insertatindex(node head,int data,int index){
        node newnode=new node(data);
        int count=0;
        node temp=head;
        if(index==0){
            newnode.next=head;
            head=newnode;
            return head;
        }
        while(temp.next!=null && count<index){
            temp=temp.next;
            count+=1;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    static void print(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        node head=new node(10);
        head=insertll(3, head);
        head=insertll(56, head);
        head=insertatlast(head, 11);
        head=insertatindex(head,5,0);
        print(head);

    }   
}
