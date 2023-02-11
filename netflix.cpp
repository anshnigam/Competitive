#include<bits/stdc++.h>
using namespace std;
void solve(){
    int a,b,c,x;
    bool flag = false;
    cin>>a>>b>>c>>x;
    if(a+b >= x){
        cout<<"yes"<<endl;
        return;
    }
    else if(c+b >= x){
        cout<<"yes"<<endl;
        return;
    }
    else if(a+c >= x){
        cout<<"yes"<<endl;
        return;
    }
    else{
        cout<<"no"<<endl;
    }
}
int main(){
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}