#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  
 string sen,word="";
  const char* p="the";
  getline(cin,sen);
  sen=sen+" ";
  for(auto x:sen){
    if(x!=' '){
  	word=word+x;
    }
    else{
      
      if(word!=p)
        cout<<word<<" ";
    word="";}
    
  }  
    
      
   return 0;   
}