/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,ArrayList<Integer> list){
        long count=1;
        long ans=0;
        for(int i=0;i<n-1;i++){
            if(list.get(i)>list.get(i+1)){
                ans += (count*(count+1))/2;
                count=1;
            }
            else    count++;
        }
        ans+=(count*(count+1))/2;
        System.out.println(ans);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            solve(n,list);
		}
	}
}
