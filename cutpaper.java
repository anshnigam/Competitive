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
		    int i = (n - (n%k));
		    int v = (i*i)/(k*k) ;
		    System.out.println(v);
		}
	}
}
