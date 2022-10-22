/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,String str){
        int idx = -1;
        for(int i=1;i<n;i++){
            if(str.charAt(i) == '1'){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            idx = n;
        }
        System.out.println(idx);
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
