import java.util.*;
import java.io.*;
public class xormax {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    String a = br.readLine();
            String b = br.readLine();
            int a0=0,b0=0,a1=0,b1=0,c1=0,c0=0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i) == '1')  a1++;
                else    a0++;
            }
            for(int i=0;i<b.length();i++){
                if(b.charAt(i) == '1')  b1++;
                else    b0++;
            }
            c1 = (int)Math.min(b0,a1) + (int)Math.min(b1,a0) ;
            c0 = a.length() - c1;
            for(int i=0;i<c1;i++)
                System.out.print("1");
            for(int i=0;i<c0;i++)
                System.out.print("0");
            System.out.println();
		}
	}
}
