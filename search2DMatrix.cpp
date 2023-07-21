#include<bits/stdc++.h>
using namespace std;
bool searchMatrix(vector<vector<int>>& matrix, int target) {
    int m = matrix.size();
    int n = matrix[0].size();
    int end = m*n - 1,st=0;
    while(st <= end){
        int mid = (st+end)/2;
        int i = mid/n;
        int j = mid%n;
        if(matrix[i][j] == target)  return true;
        else if(matrix[i][j] > target)   end = mid-1;
        else    st = mid+1;
    }
    return false;
}