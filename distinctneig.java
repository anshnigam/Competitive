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
			int[] arr = new int[n+1];
			Arrays.fill(arr,0);
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<2*n;i++){
				int v = Integer.parseInt(st.nextToken());
				arr[v] += 1;
			}
			int max = 0;
			for(int i=1;i<n+1;i++){
				if(max < arr[i])	max = arr[i];
			}
			if(max - n <= (int) Math.ceil(n/2)){
				System.out.println("YES");
			}
			else	System.out.println("NO");
		}
	}
}
