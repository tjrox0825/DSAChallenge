#include <iostream>
using namespace std;

int main() 
{	
	int i=0;
	int j=0;
	int n;
	int m;
	cout << "Enter the number of rows: n: "<<endl;
	cin>>n;
	cout << "Enter the number of columns: m: "<<endl;
	cin>>m;

	for(i=0; i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			cout<<" * ";
		}
		cout<<endl;
	}
	return 0;
}