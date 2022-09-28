/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int[] a,int n){
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        int min = a[0];
        int maxl=0;
        for(int i=1;i<n;i++){
            ans[i] = a[i] - min;
            if(a[i] < min){
                min = a[i];
            }
            if(maxl < ans[i]){
                maxl = ans[i];
            }
        }
        if(maxl > 0){
            System.out.println(maxl);
        }
        else{
            System.out.println("UNFIT");
        }
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
