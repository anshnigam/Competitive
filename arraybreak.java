/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int eve,int odd){
        if(eve == 0|| odd == 0){
            System.out.println(0);
            return;
        }
        else if(odd >= eve){
            System.out.println(eve);
            return;
        }
        else{
            System.out.println(eve);
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
		    int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> lst = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            int eve=0,odd=0;
            for (int i = 0; i < n; i++) {
                int p = Integer.parseInt(st.nextToken());
                lst.add(p);
                if(p%2 == 0)    eve++;
                else    odd++;
            }
            solve(eve,odd);
		}
	}
}
