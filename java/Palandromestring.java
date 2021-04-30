import java.io.*;
import java.util.*;
public class Palandromestring {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder input1 = new StringBuilder();


        input1.append(A);


        input1.reverse();
        String input2 = new String(input1);
        if(A.equals(input2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


    }
}



