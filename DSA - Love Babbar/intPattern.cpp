#include <iostream>
using namespace std;

int main()
{
	int i=1;
	int j=1;
	int n;
	int m;

	cout << " Enter the Number of Rows: n: ";
	cin>>n;
	cout << " Enter the Number of Columns: m: ";
	cin>>m;

	for (i=1;i<=n;i++)
	{
		for(j=1;j<=m;j++)
		{
			cout<<j;
		}
		cout<<endl;
	}

	return 0;
}