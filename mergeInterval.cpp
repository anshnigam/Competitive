#include<bits/stdc++.h>
using namespace std;
bool compareValue(vector<int> i,vector<int> j){
    return (i[0] < j[0]);
}
vector<vector<int>> merge(vector<vector<int>>& intervals) {
    vector<vector<int>> ans;
    sort(intervals.begin(),intervals.end(),compareValue);
    for(int i=0;i<intervals.size();i++){
        if(ans.empty() || ans.back()[1] < intervals[i][0]){
            ans.push_back(intervals[i]);
        }
        else if(ans.back()[1] > intervals[i][0]){
            ans.back()[1] = max(intervals[i][1],ans.back()[1]);
        }
    }
    return ans;
}
int main(){
    vector<vector<int>> tem;
    tem.push_back({1,4});
    tem.push_back({4,5});
    merge(tem);
}