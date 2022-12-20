
import java.util.*;
import java.io.*;
class expenses
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
		    int n = Integer.parseInt(st.nextToken());
		    int x = Integer.parseInt(st.nextToken());
		    long ans = (long)Math.pow(2,x-n);
		    System.out.println(ans);
		}
	}
}
