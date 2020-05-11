#include<iostream>
using namespace std;
int main()
{
 int n;
  float ht;
  
  std::cin>>n>>ht;
  
  if(n==2)
  { 
   ht=ht+ht*0.5;
    std::cout<<ht;
  
  }
  
   else if(n==3)
   { 
    ht=ht*2;
     
    std::cout<<ht;
     
   
   }
  else if(n>3)
  {
      std::cout<<"Number of items is more";
  
  }
  
  
}