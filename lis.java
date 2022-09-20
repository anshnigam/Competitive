import java.io.*;
import java.util.*;

public class lis {
    static void LIS(ArrayList list){
        int[] ans = new int[list.size()];
        Arrays.fill(ans,1);
        for(int i=1;i<list.size();i++){
            int max=0;
            for(int j=0;j<i;j++){
                if((Integer)list.get(j) < (Integer)list.get(i) && max < ans[j])
                max = ans[j];
            }
            ans[i] = max+1;
        }
        int max = 0;
        for(int i : ans){
            if(i>max)   max = i;
        }
        System.out.println(max);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        LIS(list);
        br.close();
    }
}
