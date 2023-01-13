import java.util.*;
import java.io.*;
public class divisibleby {
    static int gcd(int a,int b){
        if(a==0)    return b;
        else    return gcd(b%a,a);
    }
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            boolean flag = false;
            for(int i=0;i<n;i++){
                a[i] = Integer.parseInt(st.nextToken());
                if(a[i] == 1)   flag = true;
            }
            if(flag){
                for(int i=0;i<n;i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                continue;
            }
            int g=a[0];
            for(int i=0;i<n;i++)
                g = gcd(a[i],g);
            for(int i=0;i<n;i++){
                System.out.print((a[i]/g) + " ");
            }
            System.out.println();
		}
	}
}
