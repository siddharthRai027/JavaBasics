public class OccurenceIndexRecurse {
    private static int[] occur(int[] arr,int key,int curr,int count){
        if(curr==arr.length){
            int ans[]=new int[count];
            return ans ;
        }

        if(arr[curr]==key){
           int rec[]=occur(arr,key,curr+1,count+1);
           rec[count]=curr;
           return rec;

        }
        else {
            int rec[] = occur(arr, key, curr + 1, count);
            return rec;
        }}
    public static void main(String[] args) {
        int arr[]={1,3,4,5,3};
        int ans[]=occur(arr,55,0,0);
        for(int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
        }





    }
}
