#include<iostream>
using namespace std;
int main()
{
  string str;
  cin>>str;
  for(int i=0;i<str.length();i++){
    if((int(str[i])>=65&&int(str[i])<=90)||(int(str[i])>=97&&int(str[i])<=122))
      cout<<str[i];
  }
  return 0;
     
}
