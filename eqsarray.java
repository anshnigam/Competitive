/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            boolean flag = false;
            if(n == 1){
                if(k == arr[0]) System.out.println("Yes");
                else            System.out.println("No");
                continue;
            }
            for(int i=0;i<n-1;i++){
                if(arr[i] == k){
                    flag = true;
                    break;
                }
            }
            if(flag)    System.out.println("Yes");
            else        System.out.println("No");
		}
	}
}
