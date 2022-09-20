/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static int log2(int n){
		return (int)(Math.log(n)/Math.log(2)) ;
	}
	static void solve(int i,int j){
		if(i == j){
			System.out.println(0);
			return;
		}
		if(i>j){
			int t = i;
			i = j;
			j = t;
		}
		int diff = log2(j) - log2(i) ;
		int ans = diff;
		j /= (int)Math.pow(2,diff);
		while(i != j){
			i/=2;  j/=2;
        	ans += 2;
		}
		System.out.println(ans);
		return;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-- > 0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			solve(i,j);
		}
	}
}
