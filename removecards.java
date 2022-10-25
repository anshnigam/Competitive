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
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[n];
			int[] cnt = new int[11];
			Arrays.fill(cnt,0);
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(st.nextToken());
				cnt[arr[i]] += 1;
			}
			int max = 0;
			int idx = -1;
			for(int i=1;i<11;i++){
				if(cnt[i] > max){
					max = cnt[i];
					idx = i;
				}
			}
			System.out.println(n - cnt[idx]);
		}
	}
}
