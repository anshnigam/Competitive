/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(String str){
        int k=0,l=-1;
        int n = str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!= str.charAt(0) && str.charAt(i)!= str.charAt(n-1)){
                k++;
            }
            else{
                k=0;
            }
            l = Math.max(l,k);
        }
        if(l == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(l);
        }
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
