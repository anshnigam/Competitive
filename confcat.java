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
            st = new StringTokenizer(br.readLine());
			int[] c = new int[n];
			int max = Integer.MAX_VALUE , in = -1;
			for(int i=0;i<n;i++){
				c[i] = Integer.parseInt(st.nextToken());
				if(c[i]>max){
					max = c[i];
					in = i;
				}
			}
			if(in == 0){
				System.out.println("-1");
				continue;
			}
			System.out.println(in);
			for(int i=0;i<in;i++)	System.out.print(c[i]+" ");
			System.out.println();
			System.out.println(n-in);
			for(int i=in;i<n;i++)	System.out.print(c[i]+" ");
			System.out.println();
		}
	}
}
