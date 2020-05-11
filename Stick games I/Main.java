#include<iostream>
using namespace std;
void print(int sum){
  if(sum%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
}
int main(){
  int m,n;
  cin>>m,n;
  print(m+n);
}
