/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,String s){
        int nm=0,np=0,dig=0;
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '+')  np++;
            else if(s.charAt(i) == '-') nm++;
            else{
                char ch = s.charAt(i);
                num.add(ch-'0');
                dig++;
            }
        }
        Collections.sort(num);
        String ans="";
        int i=0;
        while(nm-- >0){
            ans = num.get(i) + ans;
            ans =  '-' + ans;
            i++;
        }
        while(np-- > 0){
            ans = num.get(i) + ans;
            ans = '+' + ans;
            i++;
        }
        while(i<num.size()){
            ans = num.get(i) + ans;
            ++i;
        }
        System.out.println(ans);
        return;
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
