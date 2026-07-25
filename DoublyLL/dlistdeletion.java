class node{
        int data;
        node prev;
        node next;
        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
public class dlistdeletion{
    static node insert(node head,int data){
        node newnode=new node(data);
        node temp=head;
        newnode.next=temp;
        temp.prev=newnode;
        return newnode;
    }
    static node deleteatfront(node head){
        node temp=head;
        head.next.prev=null;
        head=head.next;
        return head;
    }
    static node deleteatlast(node head){
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.prev.next=null;
        temp=temp.prev;
        return head;
    }
    static node deleteatindex(node head,int index){
        node temp=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            return null;
        }
        if(index==0){
            return deleteatfront(head);
        }
        int count=0;
        while(temp.next!=null && count<index ){
            temp=temp.next;
            count++;
        }
        temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        return head;
    }
    static void printarr(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        node head=new node(10);
        head=insert(head, 200);
        head=insert(head, 50);
        head=insert(head, 30);
        head=insert(head, 100);
        head=deleteatindex(head, 3);
        printarr(head);
    }
}