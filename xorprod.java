import java.util.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while(t-- > 0){
		    int n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> lst = new ArrayList<>();
			ArrayList<Integer> eve = new ArrayList<>();
			ArrayList<Integer> od = new ArrayList<>();
			long even = 1,odd=1;
			int mod = 998244353;
			int cnt = 0;
			for(int i=0;i<n;i++){
				int v = Integer.parseInt(st.nextToken());
				if(v%2 == 0){
					eve.add(v);
				}
				else	od.add(v);
				if(v == 1)  cnt++;
			}
			Collections.sort(eve);
			for(int i=0;i<eve.size();i++){
				if(cnt == 0)	break;
				eve.set(i,eve.get(i)+1);
				cnt--;
			}
			for(int i=0;i<eve.size();i++){
				int v = eve.get(i);
				even = (even*v)%mod;
			}
			for(int i=0;i<od.size();i++){
				int v = od.get(i);
				odd = (odd*v)%mod;
			}
			System.out.println((even*odd)%mod);
			
		}
	}
}
