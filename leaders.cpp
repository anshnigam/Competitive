#include<bits/stdc++.h>>
using namespace std;
vector<int> leaders(vector<int> &arr){
    int maxr=-1;
    int n = arr.size();
    vector<int> leaders;
    for(int i=n-1;i>=0;i--){
        if(arr[i] > maxr){
            leaders.push_back(arr[i]);
            maxr = max(maxr,arr[i]);
        }
    }
    return leaders;
}