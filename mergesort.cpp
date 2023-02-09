#include<iostream>
#include<vector>
#include<bits/stdc++.h>
void merge(std::vector<int> &v,int st,int mid,int end){
    std::vector<int> temp;
    int l = st,r=mid+1;
    while(l <= mid && r<=end){
        if(v[l] <= v[r]){
            temp.push_back(v[l]);
            l++;
        }
        else{
            temp.push_back(v[r]);
            r++;
        }
    }
    while(l<=mid){
        temp.push_back(v[l]);
        l++;
    }
    while(r<=end){
        temp.push_back(v[r]);
        r++;
    }
    for(int i=st;i<=end;i++){
        v[i] = temp[i-st];
    }
}
void mergesort(std::vector<int> &v,int st,int end){
    if(st >= end)   return;
    int mid = (end-st)/2 + st;
    mergesort(v,st,mid);
    mergesort(v,mid+1,end);
    merge(v,st,mid,end);
}
int main(){
    std::vector<int> v{1,9,2,5,7,4,3};
    mergesort(v,0,6);
    for(auto it = v.begin();it != v.end();it++)
    std::cout<<*it<<" ";
}