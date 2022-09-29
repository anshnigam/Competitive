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
            HashMap<Integer,Integer> map = new HashMap<>();
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                int v = Integer.parseInt(st.nextToken());
                if(map.containsKey(v)){
                    int p = map.get(v);
                    map.put(v,p+1);
                }
                else{
                    map.put(v,1);
                }
            }
            int mx=-1;
            for(Map.Entry<Integer,Integer> e: map.entrySet()){
                if(mx < e.getValue().intValue())
                    mx = e.getValue();
            }
            System.out.println((int)Math.ceil(Math.log(mx)/Math.log(2)));
		}
	}
}
