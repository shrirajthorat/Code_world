/*
#include <iostream>
#include<string.h>
#include<string>
using namespace std;

char s[20],tos=-1,MaxSize;

void push(char c)
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

int priority(char c)
{
	if(c=='(')
		return 4;
	else if(c == '^') 
		return 3; 
    else if(c == '*' || c == '/') 
		return 2; 
    else if(c == '+' || c == '-') 
	   return 1; 
    else
	    return -1; 
}

int main()
{
   string p;
    char a[10];
	cout<<"Enter String ";
	cin>>a;
   
   for(int i=0;i<strlen(a);i++)
	{
		if((a[i] >= 'a' && a[i] <= 'z')||(a[i] >= 'A' && a[i] <= 'Z'))
			p+=a[i];
		else if(a[i]=='(')
		{
			push(a[i]);
		}
		else if(a[i]==')')
		{
			while(tos!=-1 && s[tos]!='(')
			{	
				char c=pop();
				p+=c;
				
			}
			 if(s[tos] == '(') 
				{ 
					char c = pop(); 
				} 
		}
		else
		{
			while(tos!=-1 && priority(a[i])<=priority(s[tos]))
			{
				 if(s[tos] == '(') 
				{ 
					char c = pop(); 
				}
				 else
				 { 
					char c = pop(); 
					p+= c; 
				 }
            } 
            push(a[i]);		
		}
   }
	
   while(tos!= -1) 
    { 
        char c = pop(); 
         p+= c; 
    } 

   std::cout<< p <<endl;
	
    return 0;
}
*/