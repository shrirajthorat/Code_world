#include<iostream>
using namespace std;

void disp(int a)
{
	cout<<"function pointer"<<a<<endl;
}
int main()
{
	void (*p)(int);
	p=disp;
	
	p(5);
}
