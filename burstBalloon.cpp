#include<bits/stdc++.h>
using namespace std;
/*
n = nums.size()
nums = 1 + nums + 1
f(1,n);
many ways=>recursion/dp
f(i,j):
    if(i>j) return 0;
    for(k = i->j){
        ct = f(i,k-1) + f(k+1,j) + a[i-1]*a[k]*a[j+1]
        mini = min(mini,ct) 
    }
    return mini;
*/
int maxCoins(vector<int>& nums) {
    int n = nums.size();
    nums.insert(nums.begin(),1);
    nums.push_back(1);
    vector<vector<int>> dp(n+2,vector<int>(n+2,0));
    for(int i=n;i>0;i--){
        for(int j=1;j<=n;j++){
            if(i>j) continue;
            int mini = -1e9;
            for(int k=i;k<=j;k++){
                int ct = dp[i][k-1] + dp[k+1][j] + nums[i-1]*nums[k]*nums[j+1];
                mini = max(ct,mini);
            }
            dp[i][j] = mini;
        }
    }
    return dp[1][n];
}