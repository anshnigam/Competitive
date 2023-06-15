#include<bits/stdc++.h>
using namespace std;
int majorityElement(vector<int>& nums) {
    int ele,cnt=0;
    for(int i=0;i<nums.size();i++){
        if(cnt==0){
            ele = nums[i];
            cnt=1;
            continue;
        }
        if(nums[i] == ele)  cnt++;
        else    cnt--;
    }
    return ele;
}