#include<iostream>
using namespace std;
int main()
{
 int a,b=0,c=1;
  cin>>a;
  int aa=0;
  for(int i=2;i<a;++i)
  {
    aa=b+c;   
    b=c;
    c=aa;
    
    // cout<<b;
  }
  cout<<aa;
  
  
}