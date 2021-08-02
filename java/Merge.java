import java.util.Scanner;
public class Merge {

    public void mergSort(int arr[],int l,int mid,int r){
        int len1 = (mid - l)+1;
        int len2 = r-mid;
        int []le= new int[len1];
        int []ri = new int[len2];
        for(int i =l;i<len1;i++){
            le[i]=arr[i];
        }
        for(int i =mid+1;i<r;i++){
            ri[i]=arr[i];
        }
        int i =0,j=0;
        int k=l;
        while(i<=len1&&j<=len2){
            if(le[i]<=ri[i]){
                arr[k]=le[i];
                i++;
            }
            else{
                arr[k]=ri[j];
                j++;
            }
            k++;
        }
        while(i<len1){
            arr[k]=le[i];
            i++;k++;
        }
        while(j<len2){
            arr[k]=ri[j];
            k++;j++;
        }


    }
    private  void sorts(int arr[],int l,int r){
        if(l<r){
            int mid=(l+r)/2;
            sorts(arr,l,mid);
            sorts(arr,mid+1,r);
            mergSort(arr,l,mid,r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len =sc.nextInt();
        Merge me = new Merge();
        int[] arr = new int[len];
        for(int i =0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int l = 0;
        int r = len;
        me.sorts(arr,0,len-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }





    }

}
