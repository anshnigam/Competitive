import java.io.*;
import java.util.*;
public class makeap {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
		    int a = Integer.parseInt(st.nextToken());
		    int c = Integer.parseInt(st.nextToken());
		    int b = a+c;
		    if(b%2 == 0)    System.out.println(b/2);
		    else    System.out.println(-1);
		}
	}
}
