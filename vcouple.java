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
            int[] a = new int[n];
            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());;
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                b[i] = Integer.parseInt(st.nextToken());;
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int[] l = new int[n];
            int max = -1;
            for(int i=0;i<n;i++){
                l[i] = a[i] + b[n-i-1] ;
                if(l[i] > max)  max = l[i];
            }
            System.out.println(max);
		}
	}
}
