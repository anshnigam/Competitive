#include<bits/stdc++.h>
using namespace std;
void setZeroes(vector<vector<int>>& matrix) {
    int m = matrix.size();
    int n = matrix[0].size();
    vector<int> row(m,1),column(n,1);
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(matrix[i][j] == 0){
                row[i] = 0;
                column[j] = 0;
            }
        }
    }
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(row[i] == 0 || column[j] == 0){
                matrix[i][j] = 0;
            }
        }
    }
    return;
}
int main(){
    vector<vector<int>> matrix;
    vector<int> temp = {0,1,2,0};
    matrix.push_back(temp);
    temp = {3,4,5,2};
    matrix.push_back(temp);
    temp = {1,3,1,5};
    matrix.push_back(temp);
    setZeroes(matrix);
}