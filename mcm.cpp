#include<bits/stdc++.h>
using namespace std;
int mod = 1e9 + 7;
/*
arr =[1,2,3,4,5];
Dp on partitions.
(i,j) = i->k and k+1->j.
f(1,n-1)
*/
int f(int i,int j,vector<int> arr){
    if(i == j)  return 0;
    int mini = 1e9;
    for(int k=i;k<j;k++){
        int cost = (arr[i-1]*arr[k]*arr[j]) + f(i,k,arr)+f(k+1,j,arr);
        mini = min(mini,cost);
    }
    return mini;
}
int MCM(vector<int> &arr,int n){
    vector<vector<int>> dp(n,vector<int>(n,0));
    for(int i=n-1;i>=0;i--){
        dp[i][i] = 0;
        for(int j=i+1;j<n;j++){
            int mini = 1e9;
            for(int k=i;k<j;k++){
                int cost = (arr[i-1]*arr[k]*arr[j]) + f(i,k,arr)+f(k+1,j,arr);
                mini = min(mini,cost);
            }
            dp[i][j] = mini;
        }
    }
    return dp[1][n-1];
}
int main(int argc, char const *argv[])
{
    int n;
    cin>>n;
    vector<int> arr(n,0);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<f(1,n-1,arr)<<endl;
    cout<<MCM(arr,n);
    return 0;
}
