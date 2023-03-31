#include<bits/stdc++.h>
using namespace std;
int minInsertions(string s) {
    int n = s.size();
    vector<int> prev(n+1,0),ahead(n+1,0);
    vector<vector<int>> dp(n+1,vector<int>(n+1,0));
    for(int i=1;i<=n;i++){
        for(int j=1;j<n+1;j++){
            if(s[i-1] == s[n-j]){
                ahead[j] = prev[j-1]+1;
            }
            else{
                ahead[j] = max(prev[j], ahead[j-1]);
            }
        }
        prev = ahead;
    }
    return (n - ahead[n]);
}
int main(){
    cout<<minInsertions("mbadm")<<endl;
    cout<<minInsertions("leetcode")<<endl;
}