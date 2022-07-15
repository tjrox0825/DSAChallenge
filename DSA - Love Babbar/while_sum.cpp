#include<iostream>
using namespace std;

int main() {
	int n;
	cout<<"Enter the number n: ";
	cin>>n;

	int i=1;
	int sum=0;

	while(i<=n)
	{
		sum=i+sum;
		i=i+1;
	}
	cout<<"The Sum is: "<<sum<<endl;
}