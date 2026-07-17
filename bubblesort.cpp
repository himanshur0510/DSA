#include<iostream>
#include<stdio.h>
using namespace std;
int main(){
    int n;
    int y;
    int t;
    cout<<"Enter the number n"<<" ";
    cin>>n;
    int arr[n];
    for(int k=0;k<n;k++){
        printf("ENter the number:");
        cin>>arr[k];
        printf("\n");
    }
    for (int i=0;i<n-1;i++){
        for (int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
        }
    }
    for (int p=0;p<n;p++){
        printf("%d ",arr[p]);
    }
}