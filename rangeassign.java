/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int[] arr,int n){
        if(arr[0] == arr[n-1]){
            System.out.println("YES");
            return;
        }
        boolean fl = false;
        for(int i=1;i<n-1;i++){
            if(arr[0] == arr[i] && arr[i+1] == arr[n-1]){
                fl = true;
                break;
            }
        }
        if(fl)  System.out.println("YES");
        else    System.out.println("NO");
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
