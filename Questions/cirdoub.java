class node{
    node next;
    node prev;
    int data;
    node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
public class cirdoub {
    static node insertatfront(int data,node head){
        node newnode=new node(data);
        if(head==null){
            newnode.next=newnode;
            newnode.prev=newnode;
            return newnode;
        }
        head.prev=newnode;
        newnode.next=head;
        node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        newnode.prev=temp;
        temp.next=newnode;
        return newnode;
    }
    static node insertatend(int data,node head){
        node newnode=new node(data);
        if(head==null){
            newnode.next=newnode;
            newnode.prev=newnode;
            return newnode;
        }
        node temp=head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=head;
        head.prev=newnode;
        return head;
    }
    static node insertatindex(int data,node head,int index){
        node newnode=new node(data);
        if(head==null){
            newnode.next=newnode;
            newnode.prev=newnode;
            return newnode;
        }
        node temp=head;
        int count=0;
        while(index-1>count){
            if(temp.next==head){
                System.out.println("iNdex out of bound");
                return null;
            }    
            temp=temp.next;
            count++;
        }
        newnode.next=temp.next;
        temp.next.prev=newnode;
        temp.next=newnode;
        newnode.prev=temp;
        return head;
    }
    static node deleteatfront(node head){
        if(head==null){
            System.out.println("Nothig is there");
            return null;
        }
        node last=head.prev;
        head=head.next;
        head.prev=last;
        last.next=head;
        return head;
    }
    static node deleteatend(node head){
        if(head==null){
            System.out.println("Nothing is here");
            return null;
        }
        if(head.next==head){
            System.out.println("null");
            return null;
        }
        node temp=head;
        while(temp.next.next!=head){
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
        return head;
    }
        static void display(node head){
            if(head==null){
                System.out.println("Null");
                return;
            }
            node temp=head;
            while(temp.next!=head){
                System.out.println(temp.data);
                temp=temp.next;
            }
            System.out.println(temp.data);
        }
        static void displayfromend(node head){
            if(head==null){
                System.out.println("Nothing is here");
                return;
            }
            
            node temp=head;
            if(temp.prev==head){
                System.out.println(temp.prev.data);
                return;
            }
            while(temp.next!=head){
                temp=temp.next;
            }
            while(temp.prev!=head){
                System.out.println(temp.data);
                temp=temp.prev;
            }
            System.out.println(temp.prev.data);
        }
    public static void main(String[] args) {
        node head = null;
        head = insertatend(10, head);
        head = insertatend(20, head);
        head = insertatend(30, head);
        head = insertatfront(5, head);
        head = insertatindex(15, head, 2);
        head = insertatend(40, head);
        System.out.println("Forward:");
        display(head);
        System.out.println("Reverse:");
        displayfromend(head);
        head = deleteatfront(head);
        head = deleteatend(head);
        System.out.println("After deleting front and end:");
        display(head);
        head = insertatfront(1, head);
        head = insertatend(50, head);
        head = insertatindex(25, head, 4);
        System.out.println("Final List:");
        display(head);
        System.out.println("Final Reverse:");
        displayfromend(head);
    }
}

