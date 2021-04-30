import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class Substringcomparision {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String arr[] = new String[s.length()-(k - 1)];
        for (int i = 0 ; i<s.length()-k;i++){
            String m="";

            for(int j=i;j<k+i;j++) {
                m = m + s.charAt(j);

            }
            System.out.println(Arrays.stream(arr).iterator());
            arr[k]  = m;
            k = k + 1;
//            int l = m.compareTo(smallest);
//            System.out.println("value of l" + l);
//            ifl > {
//                smallest=m;
//            }
//            int o =m.compareTo(largest);
//            System.out.println("value of o" + 0);
//            if(o<0){
//                largest=m;
//            }
//            System.out.println("s = " +  smallest);
//            System.out.println("l = " + largest);
        }
        Arrays.sort(arr);
        return arr[0] + "\n" + arr[arr.length-1];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}