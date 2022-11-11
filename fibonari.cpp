#include<iostream>
#include <math.h>
using namespace std;
int fib(int n){
    n=n-2;
    int r=0;
    int s = 1;
    while(n!=0){
        int t =s;
        s= r+s;
        r=t;
      
         n--;
    }
   
   return s;
}
int main(){
    int n ;
    cin>>n;
    cout<<fib(n);
}