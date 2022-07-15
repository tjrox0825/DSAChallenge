#include <iostream>
using namespace std; 
int main() {
	int a;
	cout << "enter the value of a: \t";
	cin >> a;

	if (a>0)
	{
		cout << "a is apositive integer" << endl;
	} else if (a==0)
	{
		cout << "a is equal to 0" <<endl;
	}
	else {
		cout << "a is a negative integer" << endl;
	}
}