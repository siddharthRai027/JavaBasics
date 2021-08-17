import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        char [] arr = str.toCharArray();
        for(char c: arr){
            st.push(c);
        }

        for( int  i =0;i<=str.length()-1;i++){
             arr[i]=st.pop();
        }
        for(int i = 0;i<=arr.length-1;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
