class node{
    node next;
    int data;
    node (int data){
        this.data=data;
        this.next=null;
    }
}
public class swaplinkedlist {
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
    static node swapnode(node head,int x,int y){
        if(x==y){
            return head;
        }
        node prevx=null;
        node currx=head;
        while(currx!=null && currx.data!=x){
            prevx=currx;
            currx=currx.next;
        }
        node curry=head;
        node prevy=null;
        while(curry!=null && curry.data!=y){
            prevy=curry;
            curry=curry.next;
        }
        if(currx==null || curry==null){
            return head;
        }
        if(prevx!=null){
            prevx.next=curry;
        }
        else{
            head=curry;
        }
        if(prevy!=null){
            prevy.next=currx;
        }
        else{
            head=currx;
        }
        node temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;
        return head;

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
        head=swapnode(head, 600, 900);
        display(head);
    }    
}
