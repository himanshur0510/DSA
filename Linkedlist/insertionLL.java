class node{
    int data;
    node next;
    node (int data){
        this.data=data;
        this.next=null;
    }
}
public class insertionLL {
    static node insertnode(node head,int data){
        node newnode=new node(data);
        node temp=head;
        newnode.next=temp;
        temp=newnode;
        return temp;
    }
    static node insertionsort(node head){
        node sorted=null;
        node temp=head;
        while(temp!=null){
            node next=temp.next;
            if(sorted==null || temp.data<sorted.data){
                temp.next=sorted;
                sorted=temp;
            }
            else{
                node ptr=sorted;
                while(ptr.next!=null && ptr.next.data<temp.data ){
                    ptr=ptr.next;
                }
                temp.next=ptr.next;
                ptr.next=temp;
            }
            temp=next;
        }
        return sorted;
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
        head=insertnode(head, 20);
        head=insertnode(head, 1);
        head=insertnode(head, 21);
        head=insertnode(head, 15);
        
        head=insertionsort(head);
        printarr(head);
    }
}
