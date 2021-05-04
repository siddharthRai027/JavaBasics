package echo;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> memory = new ArrayList<String>();
        for (int i = 0; i < n; i++) {

            while (true) {
                memory.add(reader.nextLine());
                System.out.println(memory.toString());

            }
        }
    }
}