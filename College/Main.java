#include<iostream>
#include<string.h>
using namespace std;

struct College{char name[100];
              char city[100];
               int establishmentYear;
               float passPercentage;
              }S1[20],temp;
int main(){
  
  int n,i,j;
  cout<<"Enter the number of colleges \n";
      
  cin>>n;
  for(i=0;i<n;i++){
    cout<<"Enter the details of college "<<i+1;
    cout<<"\nEnter name";
  cin>>S1[i].name;
    cout<<"\nEnter city";
    cin>>S1[i].city;
    cout<<"\nEnter year of establishment";
      cin>>S1[i].establishmentYear;
    cout<<"\nEnter pass percentage\n";
      cin>>S1[i].passPercentage;
  }
   for (i = 1; i < n; i++)
      for (j = 0; j < n - i; j++) {
         if (strcmp(S1[j].name, S1[j + 1].name) > 0) {
            temp = S1[j];
            S1[j] = S1[j + 1];
            S1[j + 1] = temp;
         }
      }
 cout<<"Details of colleges\n";
   for (i = 0; i < n; i++) {
     cout<<"College:"<<i+1<<"\n";
      cout<<"Name:"<<S1[i].name;
      cout<<"\nCity:"<<S1[i].city;
        cout<<"\nYear of establishment:"<<S1[i].establishmentYear<<"\nPass percentage:"<<S1[i].passPercentage<<"\n";
   }
  return 0;
}
