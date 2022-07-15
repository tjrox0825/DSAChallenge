//Finidng Factirial of n using Recursion:
#include <iostream>
using namespace std;

int fact(int n)
{
	int partialAns;
	if(n==0) {
		return 1;
	}
	partialAns = fact(n-1);
	return n* partialAns;

}

int main()
{	
	int option;
	cout<<" Enter option: "<<endl;
	cout<< " 1 to continue "<<endl;
	cout<< " 2 to exit " <<endl;
	cin>>option;
	while(option) {
	
			if(option ==1) {

			int n;
			cout<<" Enter number n to find factorial: ";
			cin >> n;
			cout<<" Factorial is: ";
			cout << fact(n) << endl;
			break;

			}
			
			else if (option==2)
			{
				break;
			}

			cout << "Enter 1 to continue or 2 to exit";
			cin>>option;
		
		
		
	}

}