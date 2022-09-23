/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,int x){
        if(x == 0){
            System.out.println(0);
            return;
        }
        else if(n == x){
            System.out.println(0);
            return;
        }
        else{
            int y = n-x;
            if(x>=y){
                System.out.println(y);
                return;
            }
            else{
                System.out.println(x);
                return;
            }
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
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            solve(n,x);
		}
	}
}
