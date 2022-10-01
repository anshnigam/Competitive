/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n){
        long count=0;
        if(n%2 != 0){
            for(int i=1;i<=n;i+=2){
                count += i*i ;
            }
        }
        else{
            for(int i=2;i<=n;i+=2){
                count += i*i ;
            }
        }
        System.out.println(count);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            solve(n);
		}
	}
}
