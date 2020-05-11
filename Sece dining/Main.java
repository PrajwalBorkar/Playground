#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[5],b[]="front";
 int i,c;
  
  cin>>a;
 // cout<<a;
  cin>>c;
 // cout<<"\t"<<c;
  i=strcmp(a,b);
  //cout<<i;
 if(i==0)
  {
     if(c==1)
     cout<<"Left Handed";
     else
     cout<<"Right Handed";
  }
    else
    {
     if(c==1)
     cout<<"Right Handed";
     else
     cout<<"Left Handed";
      
    }
 
}