struct Student
{
	char name[100];
	char dept[100];
	int year;
	float cgpa;
};

#include<iostream>
using namespace std;
#include<string.h>
int main()
{ 
	int n,i,j;		
	cout<<"Enter the number of students"<<endl;
  	cin>>n;
	struct Student stud[n];
  	struct Student t;
	j=1;
	for(i=0;i<n;i++)
	{    
		cout<<"Enter the details of student "<<j<<endl;
		cout<<"Enter name"<<endl;
		cin>>stud[i].name;
		cout<<"Enter department"<<endl;
		cin>>stud[i].dept;
		cout<<"Enter year of study"<<endl;
		cin>>stud[i].year;
		cout<<"Enter cgpa"<<endl;
		cin>>stud[i].cgpa;
		j++; 
	}
  	//comparison
  	for(i=0;i<n;i++)
 	{
    	for(j=i+1;j<n;j++)
    	{
      		if(strcmp(stud[i].name,stud[j].name)>0)
      		{
        		t=stud[i];
        		stud[i]=stud[j];
        		stud[j]=t;
      		}
    	}
  	}
	j=1;
	cout<<"Details of students"<<endl;
	for(i=0;i<n;i++)
	{   
		cout<<"Student "<<j<<endl;
      	cout<<"Name:"<<stud[i].name<<endl;
		cout<<"Department:"<<stud[i].dept<<endl;
		cout<<"Year of study:"<<stud[i].year<<endl;
		cout<<"CGPA:"<<stud[i].cgpa<<endl;
		j++;
	}

	return 0;
}