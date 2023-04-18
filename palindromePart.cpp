#include<bits/stdc++.h>
using namespace std;

/*
str = abcdefghij, ans = 9 (len-1)
str = abbabagabdgefe
break at any index
f(i): min cuts reqd for str[i....n-1]
f(i){
    mini =1e9;
    for(j=i->n-1){
        if(isPalindrome(str,i,j)){
            ct = 1 + f(j+1);
            mini = min(mini,ct)
        }

    }
    return ct;
}
f(0);
*/
bool isPalin(string &str,int i,int j){
    for(int k = i;k<=j;k++){
        if(str[k] != str[j-k+i])  return false;
    }
    return true;
}
int minCut(string s) {
    int n = s.size();
    vector<int> dp(n,0);
    int mini;
    for(int i=n-1;i>=0;i++){
        mini = 1e9;
        for(int j=i;j<n;j++){
            if(isPalin(s,i,j)){
                int ct = 1+dp[j+1];
                mini = min(mini,ct);
            }
        }
        dp[i] = mini;
    }
    return dp[0];
}