import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Stringcount {

    public static void main(String[] args) {
        int vov = 0;
        int con = 0;
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        str1 = str1.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o' || str1.charAt(i) == 'u') {
                vov = vov + 1;
            } else if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z') {
                con = con + 1;
            }
        }
            System.out.println("number of cons are " + "= " + con);
            System.out.println("number of vowels are " + "= " + vov);

            }
        }

