import java.util.Arrays;
import java.util.Scanner;

public class secondlarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =  new int [n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr[0]==arr[n-1]){
            System.out.println(-1);
        }
        for(int j =n-1;j>0;j--){
            if(arr[j]>arr[j-1]){
                System.out.println(arr[j-1]);
                break;
            }

        }
    }
}
