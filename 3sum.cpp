#include<bits/stdc++.h>
using namespace std;
vector<vector<int>> threeSum(vector<int>& nums) {
    sort(nums.begin(),nums.end());
    set<vector<int>> temp;
    int n=nums.size();
    for(int i=0;i<n;i++){
        int st=i+1,end=n-1;
        while(st<end){
            if(nums[i]+nums[st]+nums[end] == 0){
                temp.insert({nums[i],nums[st],nums[end]});
                st++;
                end--;
            }
            else if(nums[i]+nums[st]+nums[end] > 0){
                end--;
            }
            else    st++;
        }

    }
    vector<vector<int>> ans(temp.begin(),temp.end());
    return ans;
}