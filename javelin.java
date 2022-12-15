import java.util.*;
import java.io.*;
public class javelin {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            int count = 0;
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++){
                arr1[i] = Integer.parseInt(st.nextToken());
                arr2[i] = arr1[i];
                if(arr2[i] >= m)    count++;
            }
            Arrays.sort(arr2);
            if(count<x) count = x;
            System.out.print(count+" ");
            for(int j=0;j<n;j++){
                for(int i = n-count;i<n;i++){
                    if(arr1[j] == arr2[i])  System.out.print((j+1)+" ");
                }
            }
            System.out.println();
		}
	}
}
