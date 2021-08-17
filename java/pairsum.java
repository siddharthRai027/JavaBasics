import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pairsum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap();
        int []result =new int[2];
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }
            else{
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;

            }

        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int arr[] =  new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<=2){
            System.out.println(-1);
        }



    }
}
