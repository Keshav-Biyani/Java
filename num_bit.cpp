#include<iostream>
#include <math.h>
using namespace std;
int convert(int n){
    int count=0;
   while (n!=0)
   {
    if(n&1 == 1)
    {
       count++; 
    }
    n= n>>1;
   }
   return count;
   
}

main(){
    int m,n;
    cin>>m;
    cin>>n;
 cout<<convert(m) + convert(n);
}