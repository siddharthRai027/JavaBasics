import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int sum = 1;
        for (int j = 0; j < 5; j++) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }
            System.out.println(sum);
        }
    }
}