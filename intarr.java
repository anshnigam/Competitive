import java.util.*;
import java.io.*;

class intarr{
    static boolean chk(int[] arr){
        for(int i=0;i<arr.length-2;i++){
            if(arr[i] >= arr[i+1] && arr[i+1] >= arr[i+2])  return false;
            if(arr[i] <= arr[i+1] && arr[i+1] <= arr[i+2])  return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<n;i++)    arr[i]  = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            int[] b = new int[n];
            int [] c = new int[n];
            int k=0;
            for(int i=0;i<b.length;i+=2){
                b[i] = arr[k];
                k++;
            }
            for(int i=1;i<b.length;i+=2){
                b[i] = arr[k];
                k++;
            }
            k=n/2;
            for(int i=0;i<b.length;i+=2){
                c[i] = arr[k];
                k++;
            }
            k=0;
            for(int i=1;i<b.length;i+=2){
                c[i] = arr[k];
                k++;
            }
            if(chk(b)){
                for(int i : b)  System.out.print(i+" ");
                System.out.println();
            }
            else if(chk(c)){
                for(int i : c)  System.out.print(i+" ");
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }
    }
}