#include <iostream>
using namespace std;

int main () {

	int N;
	cout << " Enter N to find factorial: ";
	cin>> N;
	int fact = N;
	int i=1;

	for(i=1;i<N; i++) {
		fact = fact * i;
	}
	cout << " Factorial of N is: ";
	cout << fact <<endl;
}

