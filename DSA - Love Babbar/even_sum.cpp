#include<iostream>
using namespace std;

int main() 
{

	int n;
	cout<<"Enter the value of n:"<<endl;
	cin>>n;

	int i=1;
	int sum=0;

	for(i=1; i<=n;i++)
	{
		if(i%2==0)
	{
		
			sum=sum+i;
	}
	}
	
	cout<<"The sum of even numbers upto "<<n<<" is "<<sum<<endl;

}