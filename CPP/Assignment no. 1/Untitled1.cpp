#include<iostream>
using namespace std;

int main()
{
	char name[20];
	char address[50];
	int age;
	
	cout<<"enter name,address,age"<<endl;
	cin>>name>>age;
		cout<<"name = "<<name<<endl<<"address : "<<address<<endl<<"age : "<<age;
 cin.get(address, 100, '\n');
	cout<<"address : "<<address<<endl;
	

	return 0;
	
	
}
