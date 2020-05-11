#include<iostream>
using namespace std;
int main()
{
  int c,m=0,i;
  cin>>c;
  for(i=1;i<c+1;i++)
  {
    if(i % 2 == 0)
    m=i*i-2;
    else
      m=i*i-1;
    cout<<m<<" "; 	
  }
}