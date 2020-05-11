#include<iostream>
using namespace std;
int main()
{
  int input, correctResultCount=0;
  float result=0.0;
  while(true)
  {
    cin>>input;
    if(input<0)
    {
      result--;
      break;
    }
    if(input%2==0)
    {
      result=result-0.5;
    }
    if(input%2!=0)
    {
      result++;
      correctResultCount++;
    }
    if(correctResultCount==3)
      break;
  }
  cout<<result;
}