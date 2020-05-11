#include<iostream>
using namespace std;
int main()
{
 float x1,x2,x3,y1,y2,y3,x,y;
  std::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  x=(x1+x2+x3)/3.0;
  y=(y1+y2+y3)/3.0;
  
  std::cout<<x<<endl<<y;
}