class node{
    node next;
    int data;
    node (int data){
        this.data=data;
        this.next=null;
    }
}
public class ReversingLL {
    static node insertnode(int data,node head){
        node newnode=new node(data);
        if(head==null){
            return newnode;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    static void display(node head){
        if(head==null){
            System.out.print("empty Linked list");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    static node reverselinked(node head){
        if(head==null){
            return head;
        }
        node prev=null;
        node curr=head;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        node head=new node(1);
        head=insertnode(0, head);
        head=insertnode(500, head);
        head=insertnode(600, head);
        head=insertnode(700, head);
        head=insertnode(800, head);
        head=insertnode(900, head);
        head=insertnode(1000,head);
        display(head);
        head=reverselinked(head);
        display(head);
    }    
}
