/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int[] arr,int n){
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        ans[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if((arr[i]>0 && arr[i+1]<0) || (arr[i]<0 && arr[i+1]>0)){
                ans[i] += ans[i+1]+1; 
            }
            else{
                ans[i] = 1;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
            if(i != n-1)    System.out.print(" ");
        }
        System.out.println();
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solve(arr,n);
		}
	}
}
