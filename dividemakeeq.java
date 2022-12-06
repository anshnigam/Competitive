/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int hcf(int a, int b){
        if (a == 0)
            return b;
        return hcf(b % a, a);
    }
    static void solve(int[] arr,int n){
        int res = arr[0];
        for(int i=1;i<n;i++){
            res = hcf(res,arr[i]);
        }
        int cnt =0;
        for(int i=0;i<n;i++){
            if(arr[i] != res)   cnt+=1;
        }
        System.out.println(cnt);
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
