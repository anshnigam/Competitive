/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Binod{
    static void solve(int k,int l1,int r1,int l2,int r2,int[][] a){
        int totf = r1-l1+1;
        int tots = r2-l2+1;
        int totfo,totso;
        if(l1 == 0) totfo = a[k][r1];
        else        totfo = a[k][r1] - a[k][l1-1];
        if(l2 == 0) totso = a[k][r2];
        else        totso = a[k][r2] - a[k][l2-1];
        long sum = (totf-totfo)*totso + (tots - totso)*totfo ;
        System.out.println(sum);
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
            int q = Integer.parseInt(st.nextToken());
            int[][] a = new int[64][n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                long x = Long.parseLong(st.nextToken());
                for(int j=0;j<64;j++){
                    a[j][i] = (int)(x%2);
                    x/=2;
                }
            }
            for(int i=0;i<64;i++){
                long cnt = 0;
                for(int j=0;j<n;j++){
                    cnt += a[i][j];
                    a[i][j] = (int)cnt;//come here to check.
                }
            }
            for(int i=0;i<q;i++){
                st = new StringTokenizer(br.readLine());
                int k = Integer.parseInt(st.nextToken());
                int l1 = Integer.parseInt(st.nextToken());
                int r1 = Integer.parseInt(st.nextToken());
                int l2 = Integer.parseInt(st.nextToken());
                int r2 = Integer.parseInt(st.nextToken());
                solve(k,l1-1,r1-1,l2-1,r2-1,a);
            }
		}
	}
}
