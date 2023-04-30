#include<bits/stdc++.h>
using namespace std;
void simple_tokenizer(string s,vector<string> &vec)
{
    stringstream ss(s);
    string word;
    while (ss >> word) {
        vec.push_back(word);
    }
}
vector<string> nonrepeat(vector<string> &s,vector<string> &t){
    vector<vector<int>> lcs (s.size()+1,vector<int>(t.size() + 1,0));
    for(int i=1;i<=s.size();i++){
        for(int j=1;j<t.size();j++){
            if(s[i-1] == t[j-1])    lcs[i][j]  =lcs[i-1][j-1] + 1;
            else    lcs[i][j] = max(lcs[i-1][j],lcs[i][j-1]);
        }
    }
    int i=s.size(),j=t.size();
    vector<string> ans;
    while(true){
        if(i==0 && j==0)    break;
        if(s[i-1] == t[j-1]){
            i--;
            j--;
        }
        else if(lcs[i][j] == lcs[i][j-1]){
            ans.insert(ans.begin(),t[j-1]);
            j--;
        }
        else{
            i--;
        }
    }
    return ans;
}
int main(){
    string ss,st;
    vector<string> s,t;
    getline(cin,ss);
    getline(cin,st);
    simple_tokenizer(ss,s);
    simple_tokenizer(st,t);
    vector<string> ans = nonrepeat(s,t);
    for(auto it: ans){
        cout<<it<<" ";
    }
    return 0;
}
