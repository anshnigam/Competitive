#include<bits/stdc++.h>
using namespace std;
int* repeatedNumber(const int* A, int n1, int *len1) {
    int sum_n1 = (n1*(n1+1))/2;
    int sum_n12 = (n1*(2*n1 + 1)*(n1+1))/6 ;
    int sum_of_a = 0, sum_of_a2=0;
    for(int i=0;i<n1;i++){
        sum_of_a += A[i];
        sum_of_a2 += A[i]*A[i] ;
    }
    int k1 = sum_of_a - sum_n1;
    int k2 = (sum_of_a2 - sum_n12)/(sum_of_a-sum_n1);
    
    len1 = (int *)malloc(2*sizeof(int));
    len1[0] = (k1+k2)/2;
    len1[1] = (k1-k2)/2;
}