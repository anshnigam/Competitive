#include<bits/stdc++.h>
using namespace std;
vector<int> rearrangeArray(vector<int>& nums) {
    int pos = 0,neg = 1;
    int temp;
    vector<int> ans(nums.size(),0);
    for(int i=0;i<nums.size();i++){
        if(nums[i] > 0){
            ans[pos] = nums[i];
            pos += 2;
        }
        else{
            ans[neg] = nums[i];
            neg += 2;
        }
    }
    return ans;
}