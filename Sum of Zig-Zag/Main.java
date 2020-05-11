#include<iostream>
using namespace std;
int sumZigZag(int r,int c,int arr[50][50]){
  int sum1=0;
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
     if(i==0||i==r-1||i==j){
      //  cout<<"m
     sum1=sum1+arr[i][j];}}}
  return sum1;}
int main()
{
  int c,r,sum1=0,sum2=0;
  cin>>r>>c;
  int arr[50][50];
  for(int i=0;i<r;i++){
    for(int j=0;j<c;j++){
      cin>>arr[i][j];}}
	sum1=sumZigZag(r,c,arr);
cout<<"Sum of Zig-Zag pattern is "<<sum1;
}