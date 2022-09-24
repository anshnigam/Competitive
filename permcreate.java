/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n){
        if(n<4){
            System.out.println(-1);
            return;
        }
        else if(n == 4){
            System.out.println("3 1 4 2");
            return;
        }
        for(int i=1;i<=n;i+=2){
            System.out.print(i+" ");
        }
        for(int i=2;i<=n;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
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
