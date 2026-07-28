class node{
    node prev;
    node next;
    String promptid;
    String category;
    String promptname;
    String priority;
    node(String promptid,String category,String promptname,String priority){
        this.promptid=promptid;
        this.category=category;
        this.promptname=promptname;
        this.priority=priority;
        this.prev=null;
        this.next=null;
    }
}
public class promptvault{
    static node addprompt(String promptid,String category,String promptname,String priority,node head){
        node newnode=new node(promptid,category,promptname,priority);
        if(head==null){
            head=newnode;
            return head;
        }
        newnode.next=head;
        head.prev=newnode;
        return newnode;
    }
    static node deleteid(String id,node head){
        if(head==null){
            System.out.println("Nothing is there to Delete");
            return null;
        }
        if(head.promptid.equals(id)){
            System.out.println("Element Removed");
            head=head.next;
            head.prev=null;
            return head;
        }
        node temp=head;
        while (temp.next!=null &&!(temp.next.promptid.equals(id))){
            temp=temp.next;
        }
        if(temp.next==null){
            System.out.println("Element not found");
            return head;
        }
        System.out.println("The element "+temp.next.promptid+" is removed");
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
        return head;
    }
    static void display(node head){
        if(head==null){
            System.out.println("No elements found");
            return;
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.promptid);
            System.out.print(temp.category);
            System.out.print(temp.promptname);
            System.out.print(temp.priority);
            temp=temp.next;
        }
    }
    static void displayid(node head){
        node temp=head;
        String h="High";
        String m="Medium";
        String l="Low";
        while(temp!=null){
            if(temp.priority.equals(h)){
            System.out.print(temp.promptid);
            System.out.print(temp.category);
            System.out.print(temp.promptname);
            System.out.print(temp.priority);
            }
        temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.priority.equals(m)){
            System.out.print(temp.promptid);
            System.out.print(temp.category);
            System.out.print(temp.promptname);
            System.out.print(temp.priority);
            }
        temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            if(temp.priority.equals(l)){
            System.out.print(temp.promptid);
            System.out.print(temp.category);
            System.out.print(temp.promptname);
            System.out.print(temp.priority);
            }
            temp=temp.next;
        }
    }
    static void displayinorder(node head){
        if(head==null){
            System.out.println("Nothing is there");
            return;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.promptid);
            System.out.print(temp.category);
            System.out.print(temp.promptname);
            System.out.print(temp.priority);
            temp=temp.prev;
        }
        return;
    }
    public static void main(String args []){
        node head=new node("P001","Coding","Explain Linked List","High");
        head=addprompt("P002", "ExamPrep", "Generate Viva Questions", "High", head);
        head=addprompt("P003","Coding", "Fix Segmentation", "High", head);
        display(head);
        head=deleteid("P002", head);
        displayinorder(head);




    }
}