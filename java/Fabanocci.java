import java.util.Scanner;

public class Fabanocci {

    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(num1);
        int sum = 1;
        while(sum<=n){
            System.out.println(sum);
            sum = num1+num2;
            num1 = num2;
            num2 = sum;
        }

    }
}
