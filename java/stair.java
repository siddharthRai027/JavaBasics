import java.util.Scanner;

public class stair {
    public int climbStair(int n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        int c1 = climbStair(n-1);
        int c2 = climbStair(n-2);
        return c1+c2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for(int i =0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        stair s = new stair();
       int step = s.climbStair(n);
        System.out.println(step);




    }
}
