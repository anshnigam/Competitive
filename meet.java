import java.util.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class meet {
    public static void main(String[] args) throws IOException,ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    String p = br.readLine();
            SimpleDateFormat sf = new SimpleDateFormat("hh:mm aa");
            Date pdt = sf.parse(p);
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            Arrays.fill(arr,0);
            for(int i=0;i<n;i++){
                String tm = br.readLine();
                String l = tm.substring(0,8);
                String r = tm.substring(9);
                Date ldt = sf.parse(l);
                Date rdt = sf.parse(r);
                boolean b1 = pdt.after(ldt) || pdt.equals(ldt);
                boolean b2 = pdt.before(rdt) || pdt.equals(rdt);
                if(b1&&b2)  arr[i] = 1;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
		}
    }
}