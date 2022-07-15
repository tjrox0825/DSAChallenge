#include <iostream>
using namespace std;

int main() 
{	
	int i=1;
	int j=1;
	int n;
	int m;
	cout << "Enter the number of rows: n: "<<endl;
	cin>>n;
	cout << "Enter the number of columns: m: "<<endl;
	cin>>m;

	for(i=1; i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	return 0;
}