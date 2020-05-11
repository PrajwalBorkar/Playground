#include<iostream>
using namespace std;
int main()
{
 
  string sen;
  int v=0,d=0,w=0,sym=0,c=0;
 getline(cin,sen);
  int l=sen.length();
 
  for(int i=0;i<sen.length();i++){
    if(sen[i]=='e'||sen[i]=='i'||sen[i]=='o'||sen[i]=='a'||sen[i]=='u'||sen[i]=='A'||sen[i]=='I'||sen[i]=='O'||sen[i]=='E'||sen[i]=='U')
    {v=v+1;}
    else if(int(sen[i])==32)
      w=w+1;
    else if(int(sen[i])>=48&&int(sen[i])<=57)
      d=d+1;
    else if((int(sen[i])>=33&&int(sen[i])<=47)||(int(sen[i])>=58&&int(sen[i])<=64)){
      //cout<<sen[i]<<"\n";
      sym=sym+1;}
    else{
     // cout<<sen[i];
      c=c+1;}
   
  }
  cout<<"Vowels:"<<v<<"\n";
cout<<"Consonants:"<<c<<"\n";
cout<<"White Spaces:"<<w<<"\n";
cout<<"Digits:"<<d<<"\n";
cout<<"Symbols:"<<sym<<"\n";
  return 0;
      
}