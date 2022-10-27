/* package codechef; // don't place package name! */

import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,String str){
        int n0=0,n1=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i) == '0')    n0++;
            else    n1++;
        }
        if(n0%2 == 0 || n1%2 == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
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
            String str = br.readLine();
            solve(n,str);
		}
	}
}
