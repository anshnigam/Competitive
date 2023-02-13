#include<bits/stdc++.h>
using namespace std;
void solve(){
    int n;
    cin>>n;
    int arr[n]{0};
    map<int,int> mp;
    int max = -1;
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n;i++){
        mp[arr[i]]++;
    }
    for(auto it : mp){
        if(it.second %2 == 1){
            cout<<"Marichka"<<endl;
            return;
        }
    }
    cout<<"Zenyk"<<endl;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}