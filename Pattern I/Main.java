#include<iostream>
using namespace std;
int main()
{
 int n,n1,i,j,k,s=3;
  cin>>n;
  n1=n;
  for(int i=1;i<=4;i++)
  {
    for(k=1;k<=i;k++)
    	cout<<n1;
    n1++;

    cout<<"\n";
  }
	n1--;
  for(int i=4;i>=1;i--)
  {
    for(k=1;k<=i;k++)
        cout<<n1;
    n1--;
    cout<<"\n";
  }
}