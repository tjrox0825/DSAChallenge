#include <iostream>
using namespace std;

int main () {
	int i=2; 
	int sum=0;

	int N;
	cout << "Enter N: ";
	cin>> N;
	cout<<endl;

	for (i=2; i<=N; i++)
	{
		if (i%2==0) {
			sum = sum + i;
		}
	}

	cout << sum <<endl;
}

