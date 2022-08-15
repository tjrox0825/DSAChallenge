#include <iostream>
using namespace std;

int main() {
	int N;

cout << " Enter N to find factorial of it: ";
cin >> N;

int i = N-1;
int PROD = N;

for(i=N-1; i>=1; i--) {
	PROD = PROD * i;
	
}
cout << "Factorial is: ";
	cout << PROD<<endl;
}


