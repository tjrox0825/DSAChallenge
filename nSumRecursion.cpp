//Sum of n Natural Numbers:
#include<iostream>
using namespace std;


int add(int n)
{
	if(n==0) return 0;
	int partialAns;
	partialAns = add(n-1);
	return n + partialAns;
}

int main() {

	int n;
	cout<< " Enter the value of n: "<<endl;
	cin>> n;
	if(n<0) {
		cout<< " Enter a positive integer ";
	}
	else {
		cout << " Sum of n natural numbers is: " <<endl;
		cout << add(n) <<endl;
	}
	
}