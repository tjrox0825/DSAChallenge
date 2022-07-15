#include <iostream>
using namespace std;

int main() {

	int n;
	cout <<" Enter the value of n: ";
	cin>>n;

	int div = 2;
	int count = 0;
	
	//for loop - checking all prime till n 
	for (div=2; div*div <= n; div++ )
	{
		if(div )
		{	
			cout<<div<<" is a Prime Number ";
			div=div+1;
			count=count+1;
			break;
		}
	}

	
	
	
	
	// while(div<n)
	// {
	// 	if(n%div==0)
	// 	{
	// 		cout<< " Not Prime For "<<div<<endl;
	// 	} else {
	// 		cout << " Prime For " << div << endl;
	// 		count = count+1;
	// 	}
	// 	divi=divi+1;
	// }
	cout<<"Total Prime Numbers upto " << n << " are: " << count << endl;
	return 0;
}