#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int i,a,b,o;
  cin>>i;
  
  a=i/1000;
  b=i%10;
  
  o=a+b;
  cout<<setprecision(1);
  cout<<o;
}