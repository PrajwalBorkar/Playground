#include<iostream>
using namespace std;
int main()
{
  int c,r,sum1=0,sum2=0;
  cin>>r>>c;
  int arr[r][r];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>arr[i][j];}}
  for(int i=0;i<r;i++){
    
    for(int j=0;j<c;j++){
     // cout<<arr[i][j]<<" ";
     // if(sum1<arr[i][j]){
        sum1=sum1+arr[i][j];
       
     // }
    }
        cout<<sum1<<"\n";
      sum1=0;
    }
 
      
      
}