#include<iostream>
using namespace std;

struct book
{
	char bid[5];
	char name[30];
	int price;
};

int main()
{
	int rec;
	
	cout<<"enter hoe many records u want to genrate : "<<endl;
	cin>>rec;
	book *p=new book[rec];
	
	for(int i=0;i<rec;i++)
	{
		cin>>p[i].bid>>p[i].name>>p[i].price;
	}
	cout<<"display records:"<<endl;
	for(int i=0;i<rec;i++)
	{
		cout<<p[i].bid<<endl<<p[i].name<<endl<<p[i].price<<endl;
	}
}
