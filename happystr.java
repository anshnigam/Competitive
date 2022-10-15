/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static boolean chk(String s){
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        if(set.contains(s.charAt(0)) && set.contains(s.charAt(1)) && set.contains(s.charAt(2))){
            return true;
        }
        else return false;
    }
    static void solve(String str){
        int flag = 0;
        for(int i=0;i<str.length()-2;i++){
            if(chk(str.substring(i,i+3))){
                flag = 1;
                break;
            }
        }
        if(flag == 1)   System.out.println("Happy");
        else    System.out.println("Sad");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    solve(br.readLine());
		}
	}
}
