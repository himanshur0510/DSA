import java.util.Scanner;
public class stackarray{
    int top;
    int size;
    int [] stack;
    stackarray(int size){
        this.size=size;
        stack= new int[size];
        top=-1;
    }
    void push(int data){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stack[top]=data;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack UnderFlow");
            return;
        }
        System.out.println("Element removed from the Stack is "+stack[top]);
        top--;

    }
    void peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println("The element at the top is "+stack[top]);
    }
    void display(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        while(top!=-1){
            System.out.println(stack[top]);
            top--;
        }
    }
    public static void main(String args[]){
        stackarray hr=new stackarray(5);
        hr.push(10);
        hr.push(15);
        hr.push(20);
        hr.pop();
        hr.peek();
        hr.push(25);
        hr.push(30);
        hr.display();
        

    }
}