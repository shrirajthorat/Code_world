/*
#include<iostream>
using namespace std;
class node{	
private:
	int data;
	node *next;
	node(int e)
	{
	   data=e;
	   next=NULL;
	}
	friend class stack;
};
class stack{
	node* tos,*temp;
public:
	stack()
	{
		tos=NULL;
		temp=NULL;
	}
	void push(int e);
	void pop();
	void printStack();
};
void stack::push(int e)
{
	node *n=new node(e);
	if(tos==NULL)
	{
		tos=n;
	}else{
		n->next=tos;
		tos=n;
	}
}
void stack::pop()
{
	if(tos==NULL)
		cout<<"Stack is empty";
	else{
		temp=tos;
		tos=tos->next;
		cout<<temp->data<<" ";
		delete temp;
	}
}
void stack::printStack()
{
	temp=tos;
	while(temp!=NULL)
	{
		cout<<temp->data<<" ";
		temp=temp->next;
	}
}

int main(){
	int ch,e;
	stack l;
	do{
		cout<<"\n1)push \n2)pop \n3)printStack \n9)Exit 0		";
		cin>>ch;
		switch(ch){
		    case 1:
				cout<<"\ninsert element";
				cin>>e;
				l.push(e);
				break;
			case 2:
				l.pop();
				break;
			case 3:
				l.printStack();
				break;	
			default :
				cout<<"Invalid input";
		}
	}while(ch!=0);
}
*/
