package sortingjava;
import java.util.Scanner;
public class insertionsort {
    void insertionsort(int arr[],int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        printnewarray(arr, n);
    }
    void printnewarray(int arr[],int n){
        System.out.println("The sorted array is ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner (System.in);
        int a;
        System.out.println("Enter how manyu elments are there in the array ");
        a=scanner.nextInt();
        int arr[]=new int [a];
        for (int i=0;i<a;i++){
            System.out.println("Enter the number");
            int t=scanner.nextInt();
            arr[i]=t;
        }
        insertionsort obj=new insertionsort();
        obj.insertionsort(arr,arr.length);
    }
}
