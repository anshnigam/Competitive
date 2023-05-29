#include<bits/stdc++.h>
using namespace std;
int subarraySum(vector<int>& nums, int k) {
    map<int,int> mp;
    int sum=0;
    int count=0;
    mp[0]++;
    for(int i=0;i<nums.size();i++){
        sum+=nums[i];
        int rest = sum-k;
        if(mp.count(rest) == 1){
            count += mp[rest]; 
        }
        mp[sum]++;
    }
    return count;
}