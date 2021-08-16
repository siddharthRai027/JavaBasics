import java.util.Scanner;
import java.util.Stack;

public class StackIN {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i =0;i<=q;i++){
            int n = sc.nextInt();
            if(n==2){
                stack.push(sc.nextInt());
            }
            else{
                System.out.println(stack.pop());
            }
        }
    }
}
