#include<iostream>
#include<string>
int main() 
{ 
   std::string str;
  getline(std::cin,str);
  for(std::string::reverse_iterator
     i=str.rbegin();i<str.rend();i++)
  {
  std::cout<<*i;
}
}