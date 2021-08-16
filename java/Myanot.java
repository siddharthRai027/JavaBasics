//import java.util.HashMap;
//import java.util.Scanner;
//public class Myanot {
//    public static void main(String[] args) {
//        HashMap<Integer,Integer> map = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[]= new int [n];
//        int k = sc.nextInt();
//        for(int i =0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
//        int result =1000;
//     for(int i =0;i<n;i++){
//         if(arr[i]>0){
//             int count =1;
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//
//             }
//             if(count == k){
//                 System.out.println(result,Math.min(arr[i]));
//             }
//         }
//
//     }
//    }
//}
