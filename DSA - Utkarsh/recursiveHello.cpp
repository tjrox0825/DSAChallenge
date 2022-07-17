#include <iostream>
using namespace std;
//very important base case

//Trust the function 
//prints: hello
void say_hello(int n) {
	if (n==0) {
		return;
	}
	cout << "hello\t"<<n<<endl;
		say_hello(n-1); //recursion n-1 more times
}

int main () {
	say_hello(10); //print hello
}