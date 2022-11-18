/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            Stack<Character> s = new Stack<>();
            s.push(str.charAt(0));
            for(int i=1;i<n;i++){
                if(s.peek().charValue() == str.charAt(i)){
                    s.pop();
                    s.push('0');
                }
                else{
                    s.push(str.charAt(i));
                }
            }
            if(s.size() == 1)   System.out.println("YES");
            else{
                char ch = s.peek();
                s.pop();
                while(!s.empty() && s.peek() == ch)
                s.pop();
                if(s.empty())  System.out.println("YES");
                else    System.out.println("No");
            }
		}
	}
}
