import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int j = 1;
        while (j < n) {
            j = j + 1;
            int counter = 0;
            for (i = 2; i < j/2; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(j);
            }

        }

    }
    }

    class Second{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for(int i = 1;i<=a;i++){
                prime(i);
            }
        }

        public static void prime(int j){
            int counter = 0;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.println(j);
            }

        }
    }
