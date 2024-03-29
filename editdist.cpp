#include<bits/stdc++.h>
using namespace std;

int minDistance(string word1, string word2) {
    int n = word1.length(),m = word2.length();
    vector<vector<int>> dp(n+1,vector<int>(m+1,0));
    dp[0][0] = 0;
    for(int i=1;i<=n;i++)   dp[i][0] = i;
    for(int j=1;j<=m;j++)   dp[0][j] = j;
    for(int i=1;i<=n;i++){
        for(int j=1;j<m+1;j++){
            if(word1[i-1] == word2[j-1])    dp[i][j] = dp[i-1][j-1];
            else{
                // int rep = dp[i-1][j-1]+1;
                // int del = dp[i-1][j]+1;
                // int ins = dp[i][j-1]+1;
                dp[i][j] = min(dp[i-1][j-1],min(dp[i-1][j],dp[i][j-1]))+1;
            }
        }
    }
    return dp[n][m];
}
int main(){
    cout<<minDistance("horse","ros")<<endl;
}