/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(ArrayList<Integer> enter,ArrayList<Integer> leave,int n){
        int[] count = new int[1001];
        Arrays.fill(count,0);
        for(int i=0;i<1001;i++)
            for(int j=0;j<n;j++){
                if(i>=enter.get(j) && i<leave.get(j))
                    count[i]++;
            }
        int max=0;
        for(int i:count){
            if(i>max)   max=i;
        }
        System.out.println(max);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> enter = new ArrayList<>();
            ArrayList<Integer> leave = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                enter.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                leave.add(Integer.parseInt(st.nextToken()));
            }
            solve(enter,leave,n);
		}
	}
}
