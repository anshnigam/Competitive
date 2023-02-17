#include <bits/stdc++.h>
using namespace std;
void solve(vector<vector<int>> &arr,int n){
    vector<vector<int>> dp(n,vector<int>(n,0));
    for(int i=0;i<n;i++){
        dp[n-1][i] = arr[n-1][i];
    }
    for(int i=n-2;i>=0;i--){
        for(int j=0;j<i+1;j++){
            dp[i][j] = arr[i][j] + max(dp[i+1][j],dp[i+1][j+1]);
        }
    }
    
    cout<<dp[0][0]<<endl;
}
int main() {
	int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<vector<int>> arr;
        for(int i=0;i<n;i++){
            vector<int> temp;
            int k;
            for(int j=0;j<i+1;j++){
                cin>>k;
                temp.push_back(k);
            }
            arr.push_back(temp);
        }
        solve(arr,n);
    }
	return 0;
}