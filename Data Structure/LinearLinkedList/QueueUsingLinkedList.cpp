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
	friend class queue;
};
class queue{
	node* front,*rear,*temp;
public:
	queue()
	{
		front=NULL;
		rear=NULL;
	}
	void enqueue(int e);
	void dequeue();
	void printStack();
};
void queue::enqueue(int e)
{
	node *n=new node(e);
	if(rear==NULL)
		front=rear=n;
	else{
		rear->next=n;
		rear=n;
	}
}
void queue::dequeue()
{
	if(front==NULL)
		cout<<"Queue is Empty";
	else{
		temp=front;
		front=front->next;
		cout<<"\nDequeue data is "<<temp->data;
		delete temp;
	}
}
void queue::printStack()
{
	if(front==NULL)
		cout<<"\nQueue is Empty";
	else {
	temp=front;
	while(temp!=NULL){
		cout<<temp->data<<" ";
		temp=temp->next;
	}
	}
}
int main(){
	int ch,e;
	queue l;
	do{
		cout<<"\n1)enqueue \n2)dequeue \n3)printStack \n9)Exit 0		";
		cin>>ch;
		switch(ch){
		    case 1:
				cout<<"\ninsert element ";
				cin>>e;
				l.enqueue(e);
				break;
			case 2:
				l.dequeue();
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