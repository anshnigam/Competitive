#include<bits/stdc++.h>
using namespace std;
void sortColors(vector<int>& arr) {
    int n = arr.size();
    int low = 0,mid = 0, high = n-1;
    /* 0,low-1 all 0
        low,mid-1 all 1
        mid,high unsorted
        high+1,n-1 all 2
    */
    while(mid<=high){
        if(arr[mid] == 0){
            swap(arr[mid],arr[low]);
            mid++;
            low++;
        }
        else if(arr[mid] == 1){
            mid++;
        }
        else{
            swap(arr[mid],arr[high]);
            high--;
        }
    }
}