import java.util.*;
import java.io.*;

class makemoney
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
		    int c = Integer.parseInt(st.nextToken());
		    st = new StringTokenizer(br.readLine());
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = Integer.parseInt(st.nextToken());
		    }
		    int tot=0;
		    int sum=0;
		    for(int i=0;i<n;i++){
		        if(x - arr[i] > c){
		            arr[i] = x;
		            tot += c;
		        }
		        sum += arr[i];
		    }
		    System.out.println(sum-tot);
		}
	}
}
