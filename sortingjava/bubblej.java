package sortingjava;
import java.util.Scanner;
public class bubblej {
    void bubblesort(int arr[]){
        int t;
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.print("The sorted array is ");
        for (int z=0;z<arr.length-1;z++){
                System.out.print(arr[z]+" ");
            }
    }
    public static void main(String args[]){
        int arr[]={45,78,66,3,12};
        bubblej obj=new bubblej();
        obj.bubblesort(arr);
    }

}
