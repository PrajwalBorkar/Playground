#include<iostream>
using namespace std;
int main()
{
  int n,i=0,pos,neww,j=0,temp;
  int arr[20];
  cout<<"Enter the number of elements in the array \n";
  cin>>n;
  cout<<"Enter the elements in the array \n";
  while(i<n){
    cin>>arr[i];
    i++;
  }
  cout<<"Enter the location where you wish to insert an element \n";
  cin>>pos;
  
  if(pos>5)
    cout<<"Invalid Input";
  else{
    cout<<"Enter the value to insert \n";
  	cin>>neww;
    for(i=pos-1;i<n+1;i++){
      	temp=arr[i];
      	arr[i]=neww;
      	neww=temp;}
    cout<<"Array after insertion is \n";
    while(j<n+1){
      cout<<arr[j]<<endl;
      j=j+1;
    }  
  }
  
  
}
