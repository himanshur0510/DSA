class queue{
    int front;
    int rear;
    int queue[];
    int size;
    queue(int size){
        this.size=size;
        queue=new int[size];
        front=-1;
        rear=-1;
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Queue Overflow");
            return;
        }
        if(front==-1){
            front=0;
        }
        rear++;
        queue[rear]=data;
        
    }
    void dequeue(){
        if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("Removed "+queue[front]);
        front++;
    }
    void peek(){
        if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println("the element in the front is "+queue[front]);
    }
    void display(){
        if(front==-1 || front>rear){
            System.out.println("Queue Underflow");
            return;
        }
        int temp=front;
        while(temp<=rear){
            System.out.println(queue[temp]);
            temp++;
        }
    }
}
public class Queuearr{
    public static void main(String args[]){
        queue hr=new queue(5);
        hr.enqueue(201);
        hr.enqueue(202);
        hr.dequeue();
        hr.enqueue(203);
        hr.peek();
        hr.dequeue();
        hr.enqueue(204);
        hr.peek();
        hr.enqueue(205);
        hr.display();
    }
}