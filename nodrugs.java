/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int n,int k, int l,ArrayList<Integer> lst){
        int mx=-1;
        for(int i=0;i<n-1;i++){
            if(mx < lst.get(i)){
                mx = lst.get(i);
            }
        }
        if(mx < lst.get(n-1)){
            System.out.println("YES");
            return;
        }
        if(k < 0){
            System.out.println("NO");
            return;
        }
        int diff = mx+1-lst.get(n-1);
        int nod = (int)Math.ceil((double)diff/k);
        if(nod < l){
            System.out.println("YES");
            return;
        }
        else{
            System.out.println("NO");
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
		    st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            ArrayList<Integer> lst = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                lst.add(Integer.parseInt(st.nextToken()));
            }
            solve(n,k,l,lst);
		}
	}
}
