#include<bits/stdc++.h>
using namespace std;
int maxProfit(vector<int>& prices) {
    int n = prices.size();
    vector<vector<int>> dp(n+2,vector<int>(2,0));
    for(int i=n-1;i>=0;i--){
        for(int buy = 0;buy<2;buy++){
            if(buy){
                dp[i][buy] = max(-prices[i]+dp[i+1][0],dp[i+1][1]);
            }
            else{
                dp[i][buy] = max(prices[i] + dp[i+2][1],dp[i+1][0]);
            }
        }
    }
    return dp[0][1];
}
int main(){
    int n,k;
    cin>>n>>k;
    vector<int> prices(n,0);
    for(int i=0;i<n;i++)    cin>>prices[i];
    cout<<maxProfit(prices)<<endl;
}