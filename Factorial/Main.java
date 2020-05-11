#include<iostream>
int main()
{
    unsigned int n;
    unsigned long long factorial = 1;
    std::cin >> n;

    for(int i = 1; i <=n; ++i)
    {
        factorial *= i;
    }

    std::cout << "The factorial of " << n << " is " << factorial;    
    return 0;
}