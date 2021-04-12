import java.util.Scanner;

public class armsstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if(reverse == num1){
            System.out.println("the number is ARMSTRONG");
        }
        else{
            System.out.println("the number is not armstrong");
        }
    }

}
