
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

    class Arraygeets
    {
        public static void main (String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
            while(t-->0){
                String inputLine[] = br.readLine().trim().split(" ");
                int n = Integer.parseInt(inputLine[0]);
                int x = Integer.parseInt(inputLine[1]);

                int arr[] =  new int[n];
                inputLine = br.readLine().trim().split(" ");
                for(int i=0; i<n; i++){
                    arr[i] = Integer.parseInt(inputLine[i]);
                }
                new Solutions().sortABS(arr,n, x);
                System.out.println();

            }
        }
    }// } Driver Code Ends


//User function Template for Java

    class Solutions
    {
        //Function to sort the array according to difference with given number.
        static void sortABS(int arr[], int n,int k)
        {
            Arrays.sort(arr);
            int mn[] = new int[n];
            for(int i =0;i<n;i++){

                mn[i] = k-arr[i];
               Arrays.sort(mn);
                for(int j =mn.length;j>0;j--){
                    System.out.print(mn[j] + " ");
                }
            }
            // add your code here
        }
    }


