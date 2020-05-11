#include <iostream>
#include <string>
 
using namespace std;
 
int main()
{
    string str, rev=""; //Initialize reverse string as empty string
 
    //std::cout << "Enter a string \n";
    getline(cin,str); //Using getline to also include space in string
 
    for(int i=str.length() - 1; i>=0; i--){
        rev = rev + str[i];  //Adding characters of original string from backwords
    }
 
    //std::cout << "Original String: "<< str<<endl;
    std::cout << rev<<endl;
 
    return 0;
}