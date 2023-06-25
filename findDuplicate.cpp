#include<bits/stdc++.h>
using namespace std;
int findDuplicate(vector<int>& nums) {
    long n_sum=0,a_sum=0;
    long n = nums.size()-1;
    n_sum = (n*(n+1))/2;
    for(int i : nums){
        a_sum += i;
    }
    return (int)(a_sum-n_sum) ;
}