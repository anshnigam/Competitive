#include<bits/stdc++.h>
using namespace std;
/*
n = 7, cuts = [1,3,4,5] 3514
f(i,j) = f(i,k-1) + f(k+1,j) + (len of stick)
for independence sort cuts
cuts = 0 + cuts + n
len  =cuts[j+1] - cuts[i-1];
f(0,c-1)
*/
int minCost(int n,vector<int> &cuts){
    int c = cuts.size();
    cuts.insert(cuts.begin(),0);
    cuts.push_back(n);
    sort(cuts.begin(),cuts.end());
    vector<vector<int>> dp(c+2,vector<int>(c+2,0));
    int mini;
    for(int i=c;i>0;i--){
        for(int j=1;j<=c;j++){
            if(i>j) continue;
            mini = 1e9;
            for(int k = i;k<=j;k++){
                int cost = dp[i][k-1] + dp[k+1][j] + cuts[j+1] - cuts[i-1];
                mini = min(mini,cost);
            }
            dp[i][j] = mini;
        }
    }
    return dp[1][c];
}