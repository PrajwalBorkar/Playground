#include<iostream>
using namespace std;
int main()
{
  float a1,a2,a3,b1,b2,b3,c1,c2,c3,f,s,a,a4,b4,c4;
  std::cin>>a1>>a2>>a3>>b1>>b2>>b3>>c1>>c2>>c3;
  a4=(a1*(a2/100));
  f=(a1-a4)+a3;
  std::cout<<"In Flipkart Rs."<<f<<"\n";
  b4=(b1*(b2/100));
  s=(b1-b4)+b3;
  std::cout<<"In Snapdeal Rs."<<s<<"\n";
 c4=(c1*(c2/100));
  a=(c1-c4)+c3;
  std::cout<<"In Amazon Rs."<<a<<"\n";
  
    if(f <=s  && f <= a)
    {
        cout << "He will prefer Flipkart";
    }

    if(s < f && s < a)
    {
        cout << "He will prefer Snapdeal";
    }

    if(a<=s && a <= f) {
        cout << "He will prefer Amazon";
    }
}