#include<iostream>
using namespace std;
int main()
{
  int ball,run,c_r,c_b,t_o;
  float o_f,cr,tr;
  
  cin>>ball>>run>>c_r>>c_b;
  
  t_o=ball/6;
  o_f=(c_b/6)+((c_b%6)/10.0);
  
  cr=c_r/o_f;
  tr=(float)run/t_o;
  
  float n;
  int a=int(cr*100);
  if((a%10)>=5)
  	n=(a+10)/100.0;
  else
    n=a/100.0;
  
  int n_i=int(n*10);
  n=n_i/10.0;
  
  float m;
  int b=int(tr*100);
  if((b%10)>=5)
  	m=(b+10)/100.0;
  else
    m=b/100.0;
  
  int m_i=int(m*10);
  m=m_i/10.0;
  
  
  cout<<t_o<<endl<<o_f<<endl<<n<<endl<<m<<endl;
  if(n>tr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
}