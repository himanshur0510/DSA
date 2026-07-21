package sortingjava;
import java.util.Scanner;
public class quicksort {
    int partition(int arr[],int low,int high){
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
            if (i<j){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }int y=arr[j];
        arr[j]=arr[low];
        arr[low]=y;
        return j;
    }
    void quicksort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int pivot=partition(arr, low, high);
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1, high);
    }
    void printarr(int arr []){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the number ");
            int a=scanner.nextInt();
            arr[i]=a;
        }
        quicksort obj=new quicksort();
        obj.quicksort(arr, 0, 4);
        obj.printarr(arr);
    }
}
