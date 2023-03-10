#include<bits/stdc++.h>
using namespace std;

int maxProfit(vector<int>& prices) {
    int n = prices.size();
    vector<vector<int>> dp(n+1,vector<int>(2,0));
    dp[n][0] = dp[n][1] = 0;
    for(int i=n-1;i>=0;i--){
        dp[i][1] = max(dp[i+1][1],dp[i+1][0]-prices[i]);
        dp[i][0] = max(dp[i+1][0],prices[i] + dp[i+1][1]);
    }
    return dp[0][1];
}
int main(){
    vector<int> price{7,1,5,3,6,4};
    cout<<maxProfit(price)<<endl;
}