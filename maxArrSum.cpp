#include<bits/stdc++.h>
using namespace std;
/*
dp on partitions
at most k len
part sum = width x max(part)
f(0): 
f(i){
    for(j = i->min(i+k,n-1)){
        maxi = max(maxi,a[j]);
        sum = (j-i+1)*maxi;
        maxsum = max(maxsum,sum);
    }
    return maxsum;
}
*/
int maxSumAfterPartitioning(vector<int>& arr, int k) {
    int n = arr.size();
    vector<int> dp(n,0);
    int maxi,maxs,sum;
    for(int i=n-1;i>=0;i--){
        maxi = maxs = -1e9;
        sum=0;
        for(int j = i;j<min(i+k,n-1);j++){
            maxi = max(maxi,arr[j]);
            sum = (j-i+1)*maxi + dp[j+1];
            maxs = max(maxs,sum);
        }
        dp[i] = maxs;
    }        
    return dp[0];
}
