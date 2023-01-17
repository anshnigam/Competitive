import java.util.*;
import java.io.*;
class invycnt{
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
		    int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            long ans = 0L;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        ans += (k*(k+1))/2 ; 
                    }
                    else if(arr[i] < arr[j]){
                        ans += (k*(k-1))/2 ;
                    }
                }
            }
            System.out.println(ans);
		}
	}
}