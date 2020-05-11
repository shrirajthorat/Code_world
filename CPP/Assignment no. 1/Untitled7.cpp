#include<iostream>
using namespace std;

int main()
{
	int no;
	char *ptr;
	cout <<"how many initials no."<<endl;
	cin>>no;
	
	ptr=new char[no+1];
	
	cin>>ptr;
	cout<<ptr<<sizeof(ptr);
}
