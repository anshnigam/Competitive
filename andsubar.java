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
            if(n<=2){
                System.out.println(1);
                continue;
            }
            int v = (int)Math.floor(Math.log(n)/Math.log(2));
            int ans = (int)Math.max(n - (int)Math.pow(2,v) + 1,Math.pow(2,v)-Math.pow(2,v-1));
            System.out.println(ans);
		}
	}
}
