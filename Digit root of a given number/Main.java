#include<iostream>
using namespace std;
int main()
{
  int a,b=0,c=0;
  cin>>a;
  while(a>0)
  {
  	b=a%10;
 //  cout<<"\n1\t"<<b;
    c=c+b;
  //  cout<<"\n2\t"<<c;
    a=(a-b)/10; 
   //cout<<"\n3\t"<<a;
  }
   //cout<<"\n10\t"<<c;
 if(c>10)
 {
	 a=c;
   	c=0;
     	b=a%10;
   //cout<<"\n4\t"<<b;
   
   
    a=(a-b)/10; 
    c=a+b;
  cout<<c;
 }

}