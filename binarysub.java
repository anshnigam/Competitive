/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(String str){
        int n = str.length();
        int[] dp = new int[n+1];
        dp[n] = 1;
        dp[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            if(str.charAt(i) != str.charAt(i+1)){
                dp[i] = (dp[i+1] + dp[i+2])%998244353 ;
            }
            else{
                dp[i] = dp[i+1];
            }
        }
        System.out.println(dp[0]);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    String str = br.readLine();
            solve(str);
		}
	}
}
