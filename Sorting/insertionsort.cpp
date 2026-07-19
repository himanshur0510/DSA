#include<iostream>
#include<stdio.h>
using namespace std;
void insertionsort(int arr[],int n){
    for (int i=1;i<n;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
    }
}
void printarr(int arr[],int n){
    for (int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
int main(){
    int arr[]={5,9,1,333,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    insertionsort(arr,n);
    printarr(arr,n);
    return 0;
}