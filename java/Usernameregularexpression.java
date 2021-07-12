import java.util.Scanner;
import java.util.regex.Pattern;

class Usernameregularexpression{
    Pattern userName = Pattern.compile("^([a-zA-Z])+([\\w]{2,})+$");



    public static final String regularExpression = null;
}


class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (!userName.matches(Usernameregularexpression.regularExpression)) {
                System.out.println("Invalid");
            } else {
                System.out.println("Valid");
            }
        }
    }
}