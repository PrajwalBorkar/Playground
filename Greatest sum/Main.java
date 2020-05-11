#include<iostream>
using namespace std;
int main()
{
  int c,r,p,sum1=0,sum2=0,high=0;
  cin>>r>>c;
  int arr[r][c];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>arr[i][j];}}
  cout<<"Sum of rows is ";
  for(int i=0;i<r;i++){
    sum1=0;
    for(int j=0;j<c;j++){
     // cout<<arr[i][j]<<" ";
      sum1=sum1+arr[i][j];
      if(high<sum1){
        p=i;
        high=sum1;}
       
      }
      cout<<sum1<<" ";
    }
        cout<<"\nRow "<<p+1<<" has maximum sum "<<"\n";
      high=0;
  cout<<"Sum of columns is ";
  for(int i=0;i<c;i++){
    sum2=0;
   // cout<<high<<"\n";
    for(int j=0;j<r;j++){
     // cout<<arr[i][j]<<" ";
      sum2=sum2+arr[j][i];
      if(high<sum2){
        p=i; 
       // cout<<j;
        high=sum2;}
      else if(sum2==high)
        p=0;
        
       
      }
      cout<<sum2<<" ";
    }
        cout<<"\nColumn "<<p+1<<" has maximum sum "<<"\n";
  
  
    }
