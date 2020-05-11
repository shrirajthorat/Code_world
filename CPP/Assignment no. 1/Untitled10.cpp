#include <iostream>
using namespace std;
void disp(int b)
{
	cout<<b<<endl;
}
void disp(int &b)
{
	b=300;
}
void disp(int *b)
{
	*b=200;
}
int main()
{
	int a=100;
	disp(a);
	disp(a);
	cout<<a<<endl;
	disp(&a);
	cout<<a<<endl;
}

