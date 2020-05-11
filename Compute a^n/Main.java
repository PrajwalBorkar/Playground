#include <iostream>
using namespace std;

int main() 
{
    int exponent;
    float base, result = 1;

    std::cout << "Enter the value of a\nEnter the value of n\n";
    std::cin >> base >> exponent;

    std::cout << "The value of "<<base <<" power "<< exponent << " is ";

    while (exponent != 0) {
        result *= base;
        --exponent;
    }

    std::cout << result;
    
    return 0;
}