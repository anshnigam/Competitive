/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int[] arr,int n){
        int mx=-1;
        for(int i=0;i<n;i++){
            if(mx<arr[i]){
                mx = arr[i];
            }
        }
        System.out.println(n-mx);
        return;
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
            Arrays.fill(arr,0);
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int idx = Integer.parseInt(st.nextToken());
                arr[idx] += 1;
            }
            solve(arr,n);
		}
	}
}
