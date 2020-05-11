#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,counter=0;
  cin>>a;
  cout<<a<<endl;
      if(a==1)
    {
        goto x;
    }
  do
  {
    if(a%2==0)
    {
    	a=a/2;
    }
    else 
    {
    	a=3*a+1;
    }
    cout<<a<<"\n";
    counter++;
  }while(a!=1);
 x: cout<<counter;
}