import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.LinkedHashSet;
import java.util.Arrays;

public class Duplicatewords {

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String str = in.nextLine();
            str.toLowerCase(Locale.ROOT);

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

            System.out.println(str);

        }


    }
}
