import java.util.Scanner;

public class InvertedRightAngle {
    public static void main(String[] args) {
        int a=1;
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    for(int i =row;i>=1;i--){
        for (int j =1;j<=i;j++){
            System.out.print("* ");

        }
        System.out.println();

    }

}
}


