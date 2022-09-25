/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int[] a){
        int mx=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                mx = (int)Math.max(mx, (int)Math.abs(a[i]-a[i+1]));
            }
        }
        System.out.println(mx);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
            }
            while(q-- > 0){
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                a[i-1] = x;
                solve(a);
            }
		}
	}
}
