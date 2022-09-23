/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int a,int b,int x){
        int diff = b-a;
        x *= 2;
        if(diff%x == 0){
            System.out.println("YES");
            return;
        }
        else{
            System.out.println("NO");
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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            if(a == b){
                System.out.println("YES");
                continue;
            }
            if(a>b) solve(b,a,x);
            else    solve(a,b,x);
		}
	}
}
