#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std::cin>>a>>b;
  if(a>b)
  {
    b=b+100;
    c=b-a;
    std::cout<<c;
  }
  else
  {
    c=b-a;
    std::cout<<c;
  }
}