/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void solve(int[][] dist,int m){
        for(int k=0;k<m;k++){
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    if(i == k || k == j || dist[i][k] == 1000 || dist[k][j] == 1000) continue;
                    dist[i][j] = (int)Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }
        double min = Double.MAX_VALUE;
        int pop = -1;
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=dist[i][j];
            }
            double avg = (double) sum/m;
            if(avg < min){
                min = avg;
                pop = i;
            }
        }
        System.out.println(String.format("%d %.6f",pop+1,min));
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
        while(n-- > 0){
            int m = Integer.parseInt(br.readLine());
            int[][] map= new int[m][m];
            for(int i=0;i<m;i++)
                Arrays.fill(map[i],1000);
            for(int i=0;i<m;i++){
                st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens()){
                    int idx = Integer.parseInt(st.nextToken());
                    map[i][idx-1] = 1;
                    map[i][i] = 0;
                }
            }
            solve(map,m);
        }
	}
}
