#include <algorithm> 
#include<iostream>
#include<string>
using namespace std; 
int main() 
{ 
  std::string str1,str2;
  std::cin>>str1>>str2;
    reverse(str1.begin(), str1.end());
	
  if(str1==str2)
  {
    std::cout<<"It is correct";
  }
  else 
  {
   std::cout<<"It is wrong"; 
  }
  
  
    return 0;
}
