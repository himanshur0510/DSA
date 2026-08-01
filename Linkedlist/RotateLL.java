class node{
    int data;
    node next;
    node (int data){
        this.data=data;
        this.next=null;
    }
}
public class RotateLL {
    static node insertatfront(int data,node head){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return head;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    static node rotateright(node head,int k){
        if(head==null||head.next==null||k==0){
            return head;
        }
        int count=1;
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp.next=head;
        k=k%count;
        int steps=count-k;
        node hr=head;
        for(int i=1;i<steps;i++){
            hr=hr.next;
        }
        node newhead=hr.next;
        hr.next=null;
        return newhead;
    }
    public static void main(String args[]){
    node head = null;

    head = insertatfront(5, head);
    head = insertatfront(4, head);
    head = insertatfront(3, head);
    head = insertatfront(2, head);
    head = insertatfront(1, head);
    head=rotateright(head, 3);
    display(head);
}
}
