import java.util.Scanner;

public class SumInput {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  y = 0;
        int X=0;
        int z = 0;
        while(n > 0) {
             X = n % 10;
             y = X+y;

            n = n/10;

//            System.out.println(z);
        }
        System.out.print(y);



    }
}

