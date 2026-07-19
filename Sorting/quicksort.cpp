#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int partition(vector<int> &arr,int low,int high){
    int pivot=arr[low];
    int i=low;
    int j=high;
    while(i<j){
        while(arr[i]<=pivot && i<=high-1){
            i++;
        }
        while(arr[j]>pivot && j>=low+1){
            j--;
        }
        if(i<j) swap(arr[i],arr[j]);
    }
    swap(arr[low],arr[j]);
    return j;
}
void quicksort(vector<int> &arr,int low,int high){
    if(low>=high){
        return;
    }
    int pivot=partition(arr,low,high);
    quicksort(arr,low,pivot-1);
    quicksort(arr,pivot+1,high);
}
int main(){
    vector<int> arr={5,4,5,41,299,1,23,45};
    quicksort(arr,0,7);
    for(int i=0;i<8;i++){
        cout<<arr[i]<<" ";
    }
}