package sortingjava;
import java.util.Scanner;
public class selection {
    void selectionsort(int arr[],int n){
        for (int i=0;i<n;i++){
            int minind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minind]){
                    minind=j;
                }
            }
                int t=arr[i];
                arr[i]=arr[minind];
                arr[minind]=t;
        }
        printarr(arr,n);
    }
    void printarr(int arr[],int n){
        System.out.println("The Sorted array is ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of Elements in the array");
        n=scanner.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            System.out.println("Enter the number ");
            int a=scanner.nextInt();
            arr[i]=a;
        }
        selection obj=new selection();
        obj.selectionsort(arr, n);
    }
}
