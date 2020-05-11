#include<iostream>
using namespace std;
int printresult(int* arr,int mug,int tvol){
  int flag,sum=0,i=0;
  while(i<mug){
    sum=sum+arr[i];
    i=i+1;}
  if(sum<=tvol){
    flag=1;
  return flag;}
  else{
    flag=0;
    return 0;}
}
  
    
  
int main()
{
  int mugs,tvol,i=0;
  int* arr;
  cin>>mugs>>tvol;
  do{
    cin>>arr[i];
    i++;
  }while(i<mugs);
    int flag=printresult(arr,mugs,tvol);
  if(flag)
    cout<<"YES";
  else
    cout<<"NO";
    
}