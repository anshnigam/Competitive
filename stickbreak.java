/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(long l,long k){
        if(l%k == 0){
            System.out.println(0);
            return;
        }
        else{
            System.out.println(1);
            return;
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
            st = new StringTokenizer(br.readLine());
            long l = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            solve(l,k);
		}
	}
}
