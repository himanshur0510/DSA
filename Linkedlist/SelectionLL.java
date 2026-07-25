class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SelectionLL {
    static node insertnode(node head,int data){
        node newnode=new node(data);
        node temp=head;
        newnode.next=temp;
        temp=newnode;
        return temp;
    }
    static void sort(node head){
        node temp=head;
        while(temp!=null){
            node minindex=temp;
            node index=temp.next;
            while(index!=null){
                if(index.data<minindex.data){
                    minindex=index;
                }
                index=index.next;
            }
            int ok=temp.data;
            temp.data=minindex.data;
            minindex.data=ok;
            temp=temp.next;
        }                
    }
    static void printarr(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node head=new node(10);
        head=insertnode(head, 20);
        head=insertnode(head, 100);
        head=insertnode(head, 0);
        sort(head);
        printarr(head);
        
    }   
}
