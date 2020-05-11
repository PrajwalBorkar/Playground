#include<iostream>
int main() {

    int arr[100], i, seven = 0, sodd = 0,n;
     std::cin>>n;
   
    for (i = 0; i < 5; i++) {
       std::cin >> arr[i];
    }

    for (i = 0; i < 5; i++) {
        if (arr[i] % 2 == 0) {
            seven = seven + arr[i];
        } else {
            sodd = sodd + arr[i];
        }
    }

    std::cout << "The sum of the even numbers in the array is " << seven;
    std::cout << "\nThe sum of the odd numbers in the array is " << sodd;

    return 0;
}