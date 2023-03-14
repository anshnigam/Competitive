#include<bits/stdc++.h>
using namespace std;
vector<long long> solve(vector<vector<int> > &A, vector<vector<int> > &B) {
    int n=0;
    for(int i=0;i<A.size();i++){
        n = max(n,A[i][1]);
    }
    vector<vector<int>> post(n+1);
    
    long long nums=0;
    for(int i=0;i<A.size();i++){
        for(int j=A[i][0];j<=A[i][1];j++){
            post[j].push_back(A[i][2]);
            nums++;
        }
    }
    vector<long long> ans;
    for(int i=0;i<B.size();i++){
        // vector<int> temp = post[B[i][0]];
        for(int j = 0;j < post[B[i][0]].size();j++){
            if(post[B[i][0]][j] < B[i][1]){
                post[B[i][0]][j] = INT_MAX;
                nums -= 1;
            }
        }
        ans.push_back(nums);
    }
    return ans;
}

int main(){
    
    vector<long long> ans = 
}