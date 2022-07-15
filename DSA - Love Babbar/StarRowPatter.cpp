#include <iostream>
using namespace std;

int main() {

	int i=1;
	int j=1;
	int n;
	int count=1;

	cout<<" Enter the number of Rows: n : ";
	cin>>n;

	for(i=1;i<=n;i++)
	{
		for(j=n-i+1;j<=n;j++)
		{
			// cout<<count<<" ";
			// count=count+1;
			// cout<<"*"<<" ";
			cout<<count<<" ";
		}
		cout<<endl;
		count=count+1;
	}


}

