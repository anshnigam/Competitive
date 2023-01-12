import java.util.*;
import java.io.*;

public class gcdsubarrays {
    public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
		    long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if(n == 1){
                System.out.println(k);
                continue;
            }
            long sum = (n*(n+1))/2;
            if(k < sum){
                System.out.println(-1);
                continue;
            }
            long val = k - sum +1;
            for(int i=0;i<n-1;i++)
                System.out.print(1+" ");
            System.out.println(val);
		}
	}
}
