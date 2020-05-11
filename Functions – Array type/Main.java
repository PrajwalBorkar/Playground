#include<iostream>
using namespace std;
int detect(int s,int arr[]){
  int i=0,esum=0,osum=0;
  while(i<s){
    if(arr[i]%2==0)
      esum=esum+1;
    else
      osum=osum+1;
    i=i+1;
  }
  if(esum==s)
    return 1;
  else if(osum==s)
    return 2;
  else
    return 3;}
 
int main()
{
  int size,i=0;
  cout<<"Enter the number of elements in the array \n";
  cin>>size;
  int arr[size];
  cout<<"Enter the elements in the array \n";
  while(i<size){
    cin>>arr[i];
    i=i+1;
  }
  int p=detect(size,arr);
  if(p==1)
    cout<<"The array is Even";
  else if(p==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed"; 
}