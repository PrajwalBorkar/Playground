#include<iostream>
using namespace std;
int main()
{
	int a,b,c;
  cin>>a>>b>>c;
 
  if(a>b||a>c)
  {
    if(b<a&&b>c)
    {
      cout<<"The treasure is in box which has number "<<b;
    }
    if(c<a&&c>b)
    {
      cout<<"The treasure is in box which has number "<<c;
    }
  }
  if(b>a||b>c)
  {
      if(a<b&&a>c)
    {
      cout<<"The treasure is in box which has number "<<a;
    }
    if(c<b&&c>a)
    {
      cout<<"The treasure is in box which has number "<<c;
    }
  
  }
  if(c>a||c>b)
  {
      if(b<c&&b>a)
    {
      cout<<"The treasure is in box which has number "<<b;
    }
    if(a<c&&a>b)
    {
      cout<<"The treasure is in box which has number "<<a;
    }
  }
  

    	if(a%a==0&&b%a==0&&c%a==0)
        {
        	 cout<<"\nThe code to open the box is "<<a;
        }
  		else if(a%b==0&&b%b==0&&c%b==0){cout<<"\nThe code to open the box is "<<b;}
          
        else if(a%c==0&&b%c==0&&c%c==0){cout<<"\nThe code to open the box is "<<c;}
  		
  		else
        {  cout<<"\nThe code to open the box is "<<1;}
            
          
}        
    
 
  
  
    
  