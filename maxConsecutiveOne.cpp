#include<bits/stdc++.h>
using namespace std;

int findMaxConsecutiveOnes(vector<int>& nums) {
    int count = 0;
    int max1 = 0;
    for(int i: nums){
        if(i==1){
            count++;
            max1 = max(max1,count);
        }
        else{
            count=0;
        }
    }
    return max1;
}