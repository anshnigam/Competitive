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
            int[] arr = new int[n];
            int[] per = new int[n+1];
            Arrays.fill(per,0);
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
                per[arr[i]] +=1;
            }
            int ans=0;
            for(int i=0;i<n+1;i++){
                if(per[i] > ans){
                    ans = per[i];
                }
            }
            int ans1=0;
            for(int i=0;i<n;i++){
                if((i^(i+1)) <= 1){
                    ans1 = Math.max(ans1, per[i]+per[i+1]);
                }
            }
            ans = Math.max(ans,ans1);
            System.out.println(n-ans);
		}
	}
}
