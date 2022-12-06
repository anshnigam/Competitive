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
            boolean fl = true;
            for(int i=0;i<n/2;i++){
                if(str.charAt(i) != str.charAt((n/2)+i)){
                    fl = false;
                    break;
                }
            }
            if(fl)  System.out.println("Yes");
            else    System.out.println("NO");
		}
	}
}
