#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int a,c,i;
  cin>>a;
  
  do
  {
    c=a%10;
    a=a-c;
    a=a/10;
    i++;
  
  
  
  
  
   }while(a>0);
  cout<<i;
  
  
}