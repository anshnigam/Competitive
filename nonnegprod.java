/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(ArrayList<Integer> list, int n){
        int neg=0;
        for(int i=0;i<n;i++){
            int p = list.get(i);
            if(p==0){
                System.out.println(0);
                return;
            }
            if(p<0) neg++;
        }
        if(neg%2 == 0){
            System.out.println(0);
            return;
        }
        else{
            System.out.println(1);
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
            st = new StringTokenizer(br.readLine());
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                list.add(Integer.parseInt(st.nextToken()));
            }
            solve(list,n);
		}
	}
}
