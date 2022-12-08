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
		    int n = Integer.parseInt(br.readLine());
            int[] arr = new int[2*n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<2*n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            int cnt=0;
            boolean flag = false;
            first:
            for(int i=0;i<2*n;i++){
                cnt=0;
                for(int j=0;j<2*n;j++){
                    if(arr[j] == arr[i])    cnt++;
                    if(cnt > 2){
                        flag = true;
                        break first;
                    }
                }
            }
            if(flag)    System.out.println("No");
            else        System.out.println("Yes");
		}
	}
}
