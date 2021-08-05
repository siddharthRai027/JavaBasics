import java.util.Arrays;
import java.util.Scanner;

public class Merging {
    public static void MergeSort(int[]arr,int low,int high){
        if(low<high){


        int mid = (low+high)/2;
        MergeSort(arr,low,mid);
        MergeSort(arr,mid+1,high);
        Merge(arr,low,high,mid);
    }}
    public static void Merge(int arr[],int low,int high,int mid){

        int n1 = mid-low+1;
        int n2=high - mid;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(int i=0;i<n1;i++){
            a[i]=arr[low+i];
        }
        for(int i =0;i<n2;i++){
            b[i]=arr[mid+1+i];
        }
        int i =0;
        int j =0;
        int k=low;
        while (i<n1&&j<n2){
            if(a[i]>b[j]){
                arr[k]=b[j];
                k++;j++;
            }
            else{
                arr[k]=a[i];
                k++;i++;
            }
        }
        while(i<n1){
            arr[k]=a[i];
            i++;k++;
        }
        while(j<n2){
            arr[k]=b[j];
            k++;j++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int arr[]={6,5,12,10,9,1};
       MergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
