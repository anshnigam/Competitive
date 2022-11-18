/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,String str){
        boolean flag = true;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i) == '1' && str.charAt(i+1) == '0'){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(0);
            return;
        }
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i) == '1')    cnt++;
            else    break;
        }
        int res=0;
        for(int i=0;i<n-cnt-1;i++){
            if(str.charAt(i) == '1' && str.charAt(i+1) == '0')  res+=1;
        }
        System.out.println(res);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            String src = br.readLine();
            solve(n,src);
		}
	}
}
