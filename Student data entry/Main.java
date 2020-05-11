#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
}s1;
int main() 
{
  cin.get(s1.name,50);
  cin>>s1.roll;
  cin>>s1.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<s1.name<<"\n";
  cout<<"Roll: "<<s1.roll<<"\n";
  cout<<"Marks: "<<s1.marks;

  return 0;
}