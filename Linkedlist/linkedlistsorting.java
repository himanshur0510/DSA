class node{
    node next;
    int data;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class linkedlistsorting{
    static node insertnode(int data,node head){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return newnode;
        }
        newnode.next=head;
        head=newnode;
        return head;
    }
    static node selectionsort(node head){
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
        return head;
    }
    static node insertionsort(node head){
        if(head==null){
            return null;
        }
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
                while(ptr.next!=null && ptr.next.data<temp.data){
                    ptr=ptr.next;
                }
                temp.next=ptr.next;
                ptr.next=temp;
            }
            temp=next;
        }
        return sorted;
    }
    static node mergesort(node head){
        if(head==null || head.next==null){
            return head;
        }
        node mid=getmiddle(head);
        node second=mid.next;
        mid.next=null;
        node left=mergesort(head);
        node right=mergesort(second);
        return merge(left,right);
        
    }
    static node getmiddle(node head){
        node slow=head;
        node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static node merge(node left,node right){
        node dummy=new node(-1);
        node tail=dummy;
        while(left!=null &&right!=null){
            if(left.data<=right.data){
                tail.next=left;
                left=left.next;
            }
            else{
                tail.next=right;
                right=right.next;
            }
            tail=tail.next;
        }
        if(left!=null){
            tail.next=left;
        }
        if(right!=null){
            tail.next=right;
        }
        return dummy.next;
    }
    static void display(node head){
        if(head== null){
            System.out.println("No elements ");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        node head=new node(100);
        head=insertnode(2800, head);
        head=insertnode(200,head);
        head=insertnode(400, head);
        head=mergesort(head);
        display(head);
    }
}