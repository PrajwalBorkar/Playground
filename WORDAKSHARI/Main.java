#include<iostream>
using namespace std;
int main()
{
  string inp[20];
  int i=0,flag=0;
  do{
    cin>>inp[i];
    
    if(i>0){
    string str=inp[i-1];
    if(str[str.length()-1]==inp[i][0]){
      flag=flag+1;}}
    i=i+1;}
    while(inp[i-1]!="####");
    for(int i=0;i<=flag;i++)
      cout<<inp[i]<<"\n";
    return 0;
  
  
}
