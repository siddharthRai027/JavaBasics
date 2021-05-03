

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Duplicatewords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases-- > 0) {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();



            String[] strWords = str.split("\\s+");

            LinkedHashSet<String> lhSetWords
                    = new LinkedHashSet<String>(Arrays.asList(strWords));

            StringBuilder sbTemp = new StringBuilder();
            int index = 0;

            for (String s : lhSetWords) {

                if (index > 0)
                    sbTemp.append(" ");

                sbTemp.append(s);
                index++;

            }
            str = sbTemp.toString();
            str.equalsIgnoreCase(str);
            System.out.println(str);

        }
    }


    }
