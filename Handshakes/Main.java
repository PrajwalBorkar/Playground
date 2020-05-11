#include<bits/stdc++.h> 
using namespace std; 
int maxHandshake(int n) 
{ 
return (n * (n - 1))/ 2; 
} 
int main() 
{ 
  int n;
  std::cin>>n;
  cout << maxHandshake(n) <<endl; 
  return 0; 
} 
