package sortingjava;
import java.util.Scanner;
public class mergesort {
    void merge(int arr[],int low,int mid,int high){
        int left=low;
        int right=mid+1;
        int temp[]=new int[high-low+1];
        int k=0; 
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }
            else{
                temp[k++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=high){
            temp[k++]=(arr[right++]);
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    void mergsort(int arr[],int low,int high){
        if (low>=high){
            return;
        }
        int mid=(low+high)/2;
        mergsort(arr,low,mid);
        mergsort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    void printarr(int arr[],int n){
        System.out.println("The sorted array is ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<5;i++){
            int y=scanner.nextInt();
            arr[i]=y;
        }
        mergesort obj =new mergesort();
        obj.mergsort(arr, 0, 4);
        obj.printarr(arr,arr.length);    

    }
}
