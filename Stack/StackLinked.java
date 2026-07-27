class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class stackll{
    node top;
    stackll(){
        top=null;
    }
    void push(int data){
        node newnode=new node(data);
        newnode.next=top;
        top=newnode;
    }
    void pop(){
        if(top==null){
            System.out.println("The stack is empty");
            return;
        }
        System.out.println("The Popped element is "+ top.data);
        top=top.next;
    }
    void peek(){
        if(top==null){
            System.out.println("The stack is empty");
            return;
        }
        System.out.println("The element at top is "+ top.data);
    }
    void display(){
        node temp=top;
        if(temp==null){
            System.out.println("No elements in here");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class StackLinked {
    public static void main(String[] args) {
        stackll hr=new stackll();
        hr.push(10);
        hr.push(20);
        hr.pop();
        hr.push(50);
        hr.push(100);
        hr.display();
    }
}
