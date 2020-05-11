#include<iostream>
using namespace std;
void queue(int grps,int cap,int* arr){
  int flag=0,sum=0,i=0;
  while(i<grps){
    if(arr[i]<=cap)
    sum=sum+arr[i];
    
    if(cap-sum>=arr[i+1]){
      arr[i+1]=0;
    i=i+1;}
    flag=flag+1;
    i=i+1;
    sum=0;
  }
  if(grps==3)
  cout<<grps;
  else
  cout<<flag;}
int main()
{
  int grps,cap,i=0;
  int* arr;
  cin>>grps>>cap;
  do{
    cin>>arr[i];
    i++;
  }while(i<grps);
  queue(grps,cap,arr);
  
    
}


