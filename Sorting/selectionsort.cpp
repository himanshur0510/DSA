#include<iostream>
#include<stdio.h>
using namespace std;
void selectionsort(int arr[],int n){
    for (int i=0;i<n;i++){
        int minind=i;
        for (int j=i+1;j<n;j++){
            if(arr[j]<arr[minind]){
                minind=j;
            }
        }
        int t=arr[i];
        arr[i]=arr[minind];
        arr[minind]=t;
    }
}
void printarr(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
int main(){
    int arr[]={8,6,9,2,3,1};
    int n=sizeof(arr)/sizeof(arr[0]);
    selectionsort(arr,n);
    printarr(arr,n);
}