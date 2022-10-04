/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n){
        int sum=(n*(n-1))/2;
        if(sum%2 != 0){
            System.out.println("NO");
            return;
        }
        else{
            System.out.println("YES");
            for(int i=1;i<=n/2;i+=2)
            {
                System.out.print(i+" ");
            }
            for(int j=n/2+2;j<=n;j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
             for(int i=2;i<=n/2;i+=2)
            {
                System.out.print(i+" ");
            }
            for(int j=n/2+1;j<=n;j+=2)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
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
