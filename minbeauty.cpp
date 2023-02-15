#include<bits/stdc++.h>
using namespace std;
void solve(){
    int n,t;
    cin>>n;
    vector<int> arr;
    for(int i=0;i<n;i++){
        cin>>t;
        arr.push_back(t);
    }
    sort(arr.begin(),arr.end());
    int minm = INT_MAX;
    for(int i=1;i<n-1;i++){
        int l = 0;
        int r = n-1; 
        int minDiff = INT_MAX;
        while(l<r and l<i and r>i){
            int sum = (arr[l]+arr[i]+arr[r]);
            int dif = abs(sum - 3*arr[i]);

            if(dif <= minDiff) minDiff = dif ;
            if(minDiff == 0)    break;
            if(sum > 3*arr[i])  r--;
            else    l++;
        }
        minm = min(minm,minDiff);
    }
    cout<<minm<<endl;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}