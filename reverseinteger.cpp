#include<bits/stdc++.h>
using namespace std;
int reverse(int x) {
    if(x>0){
        string t="";
        while(x != 0){
            t += ('0'+(x%10));
            x /= 10;
        }
        try{
            return stoi(t);
        }
        catch(std::out_of_range oor){
            return 0;
        }
    }
    if(x<0){
        if(x == -2147483648)    return 0;
        string t = "-";
        x *= -1;
        while(x != 0){
            t += ('0'+(x%10));
            x /= 10;
        }
        try{
            return stoi(t);
        }
        catch(std::out_of_range oor){
            return 0;
        }
    }
    return 0;
}
int main(){
    cout<<reverse(-231)<<endl;
    cout<<reverse(23456789879)<<endl;
}