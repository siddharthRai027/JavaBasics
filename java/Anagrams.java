import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        Scanner sp = new Scanner(System.in);
        String B = sp.next();
        char charArray[] = A.toCharArray();
        Arrays.sort(charArray);
        char charArray1[] = B.toCharArray();
        Arrays.sort(charArray1);
        String m = new String(charArray);

        String n = new String(charArray);
        if(m==n){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }


    }}