#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a=0,b=0,c,d=0,e=0;
  cin>>a;
  c=a;
 while(a>0)
  {
  	b=a%10;
    a=(a-b)/10;
    //cout<<"1 \t"<<b<<endl<<"2 \t"<<a<<endl;
    if(b%2==0)
    { d=d+b;
    // cout<<"3 \t"<<d<<endl
    }
    else
    { e=e+b;
    // cout<<"4 \t"<<e<<endl;
    }
  }
  if(d==e)
    cout<<"Yes";
  else
  cout<<"No"; 
 /* int a;
  cin>>a;
  if(a==143)
    cout<<"Yes";
  else
  cout<<"No";*/
}