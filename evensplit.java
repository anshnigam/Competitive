/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(String s,int n){
        if(n<3){
            System.out.println(s);
            return;
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str = new String(ch);
        System.out.println(str);
        
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
            solve(s,n);
		}
	}
}
