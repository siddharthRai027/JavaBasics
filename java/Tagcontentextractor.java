import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tagcontentextractor{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String m = line;
            for(char i =0; i< ('>');i++){
                char[] charArray;
                charArray = m.toCharArray();
                String n = new String(charArray);
                System.out.println(n);
            }








            testCases--;
        }
    }
}



