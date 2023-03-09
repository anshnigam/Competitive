#include<bits/stdc++.h>
using namespace std;

int maxProfit(vector<int>& prices) {     
    int prof = 0;
    int mini = prices[0];
    for(int i=1;i<prices.size();i++){
        prof = max(prof,prices[i] - mini);
        mini = min(mini,prices[i]);
    }
    return prof;
}
int main(){
    vector<int> price{7,1,5,3,6,4};
    cout<<maxProfit(price)<<endl;
}