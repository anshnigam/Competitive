/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	static void solve(String p,String c){
		int[] par = new int[26];
		int[] ch = new int[26];
		Arrays.fill(par,0);
		Arrays.fill(ch,0);
		for(int i=0;i<p.length();i++){
			int idx = p.charAt(i) - 'a';
			par[idx] += 1;
		}
		for(int i=0;i<c.length();i++){
			int idx = c.charAt(i) - 'a';
			ch[idx] += 1;
		}
		boolean flag = true;
		for(int i=0;i<26;i++){
			if(par[i] < ch[i]){
				flag=false;
				break;
			}
		}
		if(!flag){
			System.out.println("NO");
			return;
		}
		else{
			System.out.println("YES");
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
		    String parent = br.readLine();
			parent = parent.replace(" ","");
			String child = "";
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++){
				child += br.readLine();
			}
			solve(parent,child);
		}
	}
}
