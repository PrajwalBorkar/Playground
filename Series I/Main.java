#include<iostream>
#include<cmath>
using namespace std;
int main()
{ 
 int n;
  double a=0.5;
  cin>>n;
 
  for(int i=0;i<n;i++)
  {  
   if(i==0)
   {
     cout<<a;
    continue;
   }
  
  else
  { 
   double t=pow(3,i-1);
    double x=t+a;
    a=x;
  cout<<" "<<x;
  }
  
  
  }
  




}