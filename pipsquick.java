/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,int h,int y1,int y2,int l,int[] tp,int[] ht){
        int i=0;
        int cnt=0;
        while(i<n){
            if(tp[i] == 1){
                if(ht[i] >= h-y1){
                    i++;
                    cnt++;
                }
                else{
                    l--;
                    i++;
                    cnt++;
                }
            }
            else{
                if(ht[i] <= y2){
                    i++;
                    cnt++;
                }
                else{
                    l--;
                    i++;
                    cnt++;
                }
            }
            if(l == 0)  break;
        }
        if(l == 0)  cnt-=1;
        System.out.println(cnt);
        return;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int[] ht = new int[n];
            int[] tp = new int[n];
            for(int i=0;i<n;i++){
                st = new StringTokenizer(br.readLine());
		        tp[i] = Integer.parseInt(st.nextToken());
                ht[i] = Integer.parseInt(st.nextToken());
            }
            solve(n,h,y1,y2,l,tp,ht);
		}
	}
}
