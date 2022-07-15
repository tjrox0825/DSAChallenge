#include <iostream>
using namespace std;

int main() {

	int i=1;
	int j=1;
	int n;
	int count=1;

	cout<<" Enter the number of Rows: n : ";
	cin>>n;

	while(i<=n)
	{
		while(j<=i)
		{
			cout<<count<<" ";
		}
		count=count+1;
	}
	cout<<endl;

}

