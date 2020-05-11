#include<iostream>
using namespace std;
int main()
{
  int i,j,k,N,count=0;
  std::cin>>N;
  for(i=1;i<=N;i++)
  {
    k=1;
    for(j=0;j<i;j++)
    {
      std::cout<<i;
      if(k<i)
      {
        std::cout<<"*";
        k=k+1;
      }
    }
    std::cout<<endl;
  }
  for(i=N;i>0;i--)
  {
    k=1;
    for(j=0;j<i;j++)
    {
      std::cout<<i;
      if(k<i)
      {
        std::cout<<"*";
        k=k+1;
      }
    }
   std::cout<<endl;
  }
  return 0;
}