#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=a*a*a;
  if(d>=c)
  {
  std::cout<<"Doctor, you can proceed with your experiment.";
  }
  else
     std::cout<<"Sorry Doctor! You need more bacteria.";
}