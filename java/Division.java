import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        Scanner sp = new Scanner(System.in);
        int num2 = sp.nextInt();
        System.out.println("quetent" + " = " + num1 / num2);
        System.out.println("reminder " + "=" + num1%num2);
    }
}
