/*
#include <iostream>
#include<string.h>
using namespace std;

char s[10],tos,MaxSize;

void init(int size)
{
     tos=-1;
     MaxSize=size;
}

bool isFull()
{
    if(tos==(MaxSize-1))
        return 1;
    else
		return 0;
	
}
void push(char c)
{
    if(isFull())
    {
        cout<<"\nStack is full";
    }else
    {
        tos++;
        s[tos]=c;
		
        cout<<"\nItem inserted succesfully ";
    }
}
bool isEmpty()
{
	if(tos==-1)
		return 1;
	else
		return 0;
}
void pop()
{
	if(isEmpty())
	{
		cout<<"\nStack is empty ";
	}else
	{
		cout<<"\n removed { ";
		tos--;
	}
}

void peek()
{
	cout<<s[tos]<<" ";
}

int main()
{
	int size;
	char a[10];
	cout<<"Enter { and } ";
	cin>>a;
	cout<<"\nEnter size of stack ";
	cin>>size;
	init(size);
    cout<<sizeof(a)/sizeof(a[0]);
	for(int i=0;i<strlen(a);i++)
	{
		if(a[i]=='{')
		{
			push('{');
		}
		else if(a[i]=='}')
		{
			pop();
		}
		else
		{
			cout<<"\nInvalid entery in stack";
		}
	}
	
	if(tos==-1)
	{
		cout<<"\n Balanced Expression";
	}else
	{
	    cout<<"\n unbalanced expression";
	}
	getc;
	return 0;
}


*/
