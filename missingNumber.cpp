#include<bits/stdc++.h>
using namespace std;

int missingNumber(vector<int>& nums) {
    long sum_of_arr=0;
    for(int i:nums){
        sum_of_arr += i; 
    }
    long n = nums.size();
    long sum = (n*(n+1))/2;
    return (int)(sum-sum_of_arr);
}
