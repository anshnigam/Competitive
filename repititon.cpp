#include<bits/stdc++.h>
using namespace std;
int findNotRep(int arr[],int st,int end,int n){
    if(st > end)    return -1;
    if(st == end) return arr[st];

    int mid = (st+end)/2;
    if(mid%2 == 0){
        if(arr[mid] == arr[mid+1])  return findNotRep(arr,mid+2,end,n);
        else    return findNotRep(arr,st,mid,n);
    }
    else{
        if(arr[mid] == arr[mid-1])  return findNotRep(arr,mid+1,end,n);
        else    return findNotRep(arr,st,mid-1,n);
    }
}
int main(){
    int arr[] = {3,3,7,7,10,11,11};
    cout<<findNotRep(arr,0,8,9)<<endl;
}