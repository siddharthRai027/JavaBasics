import java.util.*;

public class Array {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];

        for (int j = 0;j<n;j++){
            a[j]=scan.nextInt();
        }
        for (int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }



        scan.close();



    }
}