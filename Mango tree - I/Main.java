#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(c<a||c==(b+1)/2||c==b+1||c==2*b+1)
  {
    cout<<"Yes";
  }

  else
  {
    cout<<"No";
  }
    
  
}