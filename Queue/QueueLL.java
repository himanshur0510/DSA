class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class QueueLL {
    node front;
    node rear;
    QueueLL(){
        this.front=null;
        this.rear=null;
    }
    void enqueue(int data){
        node newnode=new node(data);
        if(rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }
    void dequeue(){
        if(front==null){
            System.out.println("Queue UnderFlow");
            return;
        }
        System.out.println("Removed "+front.data);
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    void peek(){
        if(front==null){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("The element at the front is "+front.data);
    }
    void display(){
        node temp=front;
        if(temp==null){
            System.out.println("Queue underflow");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        QueueLL hr=new QueueLL();
        hr.enqueue(200);
        hr.enqueue(201);
        hr.dequeue();
        hr.peek();
        hr.enqueue(202);
        hr.enqueue(203);
        hr.dequeue();
        hr.display();
    }
}
