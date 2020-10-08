/*
#include<algorithm>
#include <iostream>
#include<string.h>
#include<string>
using namespace std;

int s[20],tos=-1,MaxSize;

void push(int c)
{   
        tos++;
        s[tos]=c;  
}

char pop()
{
	char temp=s[tos];
		tos--;
		return temp;
}

int main()
{
	int m,n;
    char a[20];
	cout<<"Enter PostFix String ";
	cin>>a;
   int i;
   for(i=0;i<strlen(a);i++)
	{
	if(a[i] >= '0' && a[i] <= '9')
			push(a[i]-48);
	else
	{
		m=pop();
		n=pop();
		int res;
		switch(a[i]){
		case '+':
					res=(n)+(m);
					push(res);
					break;
		case '-':
					res=(n)-(m);
					push(res);
					break;
		case '*':
					res=(n)*(m);
					push(res);
					break;
		case '/':
					res=(n)/(m);
					push(res);
					break;
		}
	}
   
		
   }
	
cout<<s[0];
	
     return 0;
}
*/