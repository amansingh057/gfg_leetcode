//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().rearrange(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java




class Solution {
    void rearrange(int arr[], int n) {
        // code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        
       
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                a.add(arr[i]);
            }else{
                b.add(arr[i]);
            }
        }
        
        int count = 0;
        int i = 0;
        while(count<a.size() && count<b.size()){
            arr[i]=a.get(count);
            i++;
            arr[i] = b.get(count);
            i++;
            count++;
        }
        
        while(count<a.size()){
            arr[i] = a.get(count);
            i++;
            count++;
        }
        while(count<b.size()){
            arr[i] = b.get(count);
            i++;
            count++;
        }
        
    }
}