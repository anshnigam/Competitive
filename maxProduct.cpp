#include<bits/stdc++.h>
using namespace std;
int maxProduct(vector<int>& nums) {
    int n = nums.size();
    // for(auto it: nums){
    //     if(it == 0)    it = 1;
    // }
    int pre = 1,suff=1;
    int maxp = INT_MIN;
    for(int i=0;i<nums.size();i++){
        if(pre == 0)    pre = 1;
        if(suff == 0)    suff = 1;
        pre *= nums[i];
        suff *= nums[n-1-i];
        maxp = max(maxp,max(pre,suff));
    }
    return maxp;

}