#include<bits/stdc++.h>
using namespace std;
void nextPermutation(vector<int>& arr) {
    int id = -1,n = arr.size(),i=0;
    for(int i=n-2;i>=0;i--){
        if(arr[i]<arr[i+1]){
            id = i;
            break;
        }
    }
    if(id == -1){
        reverse(arr.begin(),arr.end());
        return;
    }
    for(int i=n-1;i>id;i--){
        if(arr[i] > arr[id]){
            swap(arr[i],arr[id]);
            break;
        }
    }
    reverse(arr.begin()+id+1,arr.end());
}
int main(){
    vector<int> arr;
    arr.push_back(1);
    arr.push_back(3);
    arr.push_back(2);
    nextPermutation(arr);
}