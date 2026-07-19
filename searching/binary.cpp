#include<iostream>
using namespace std;
int binarysearch(int arr[],int n,int x){
    int low=0;
    int high=n-1;
    while(low<=high){
        int mid=(high + low)/2;
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            high=mid-1;
        }
        else {
            low=mid+1;
        }
        
    }
    return -1;
}
int main(){
    int arr[7]={1,2,3,4,5,6,8};
    int x=5;
    int n=sizeof(arr)/sizeof(arr[0]);
    int f=binarysearch(arr,n,x);
    if(f==-1){
        cout<<"Element does not exist"<<" ";
    }
    else{
        cout<<"The element is in the index "<<f;
    }

}