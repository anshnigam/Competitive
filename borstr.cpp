#include<bits/stdc++.h>
using namespace std;
void solve(){
    int n;
    cin>>n;
    string s;
    cin>>s;
    map<pair<char,int>,int> freq;
    char cur = s[0];
    int len = 1;
    freq[{cur,len}]++;
    for(int i=1;i<n;i++){
        if(cur != s[i]){
            cur = s[i];
            len = 1;
        }
        else    len++;
        freq[{cur,len}]++;
    }

    int mx = 0;
    for(auto &it : freq){
        if(it.second == 1){
            mx = max(mx,it.first.second -1);
            continue;
        }
        mx = max(mx,it.first.second);
    }
    cout<<mx<<endl;
}
int main(){
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}