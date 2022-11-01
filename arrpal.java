/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,int[] a){
        boolean flag = true;
        int[] b = new int[n];
        Arrays.fill(b,0);
        for(int i=n/2 - 1;i>=0;i--){
            if(a[i] > a[n-1-i]){
                flag = false;
                break;
            }
            b[i] = a[n-1-i] - a[i] - b[i+1];
            if(b[i]<0){
                flag=false;
                break;
            } 
            b[i] += b[i+1];
        }
        if(flag){
            System.out.println(b[0]);
        }
        else System.out.println(-1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            solve(n,arr);
		}
	}
}
