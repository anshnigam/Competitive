/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,String str){
        String t = new String("");
        int i=0,j=str.length()-1;
        while(i <= j){
            if(i == j){
                // alice moves
                char ch = str.charAt(i);
                if(ch == '1')   t += ch;
                else t = ch + t;
                break;
            }
            // alice move
            char ch = str.charAt(i);
            if(ch == '1')   t += ch;
            else t = ch + t;
            i+=1;

            //bob move
            ch = str.charAt(j);
            if(ch == '0')   t += ch;
            else t = ch + t;
            j-=1;

        }
        System.out.println(t);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            solve(n,s);
		}
	}
}