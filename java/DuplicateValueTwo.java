import java.util.Scanner;

public class DuplicateValueTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int res;
        Boolean isBool=false;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    res=j-i;
                    isBool=true;
                    if(isBool==true&&res<=k){
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                }

            }
        }

    }
}
