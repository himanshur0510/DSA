#include<iostream>
#include<stdio.h>
using namespace std;
class node{
    public:
        int data;
        node *next;

        node(){
            data=0;
            next=NULL;
        }
        node(int data){
            this->data=data;
            this->next=NULL;
        }

};
class linkedlist{
    node *head;
    public:
    linkedlist(){
        head= NULL;
    }
    void insertathead(int data){
        node *newnode=new node(data);
        if(head==NULL){
            head=newnode;
            return;
        }
        newnode->next=this->head;
        this->head=newnode;
    }
    void print(){
        node *temp=head;
        if(temp==NULL){
            printf("Empty");
            return;
        }
        while(temp!=NULL){
            printf("%d",temp->data);
            temp=temp->next;
        }
    }
};

int main(){
    linkedlist list;
    list.insertathead(4);
    list.insertathead(3);
    list.insertathead(2);
    list.insertathead(1);
    list.print();


}