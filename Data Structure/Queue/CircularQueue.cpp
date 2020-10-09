/*
#include<iostream>

using namespace std;

int s[100],maxSize,front,rear;
int c;

void queueInit(int size)
{
	maxSize=size;
	front=0;
	rear=-1;
	c=0;
}
bool isFull()
{
	if((maxSize)==c)
	{
		return 1;
	}else
		return 0;
}
void enqueu()
{
	if(isFull())
	{
		cout<<"\n Queue is full";
	}else
	{	c++;
		int e;
		cout<<"\n Enter an element ";
		cin>>e;
		rear=(rear+1)%maxSize;
		s[rear]=e;
	}
}
bool isEmpty()
{
	if(c==0)
		return 1;
	else
		return 0;
}
void dequeue()
{
	if(isEmpty())
	{
		cout<<"\n Queue is empty ";
	}else
	{
		c--;
		cout<<s[front];
		front=(front+1)%maxSize;
	}
}
 void print()
 {
		int i,c1=0;
		i=front;
		while(c1<c)
		{
			c1++;
			cout<<" "<<s[i];
			i=(i+1)%maxSize;
		}
 }


int main()
{
	int size,ch;
	std::cout<<"Enter size of the Circular queue ";
	cin>>size;
	queueInit(size);

	do{
		cout<<"\n 1)press 1 to Enqueue	\n 2)press 2 to Dequeue \n 3)press 3 to print the queue \n 4)press 0 to Exit	";
		cin>>ch;
		switch(ch)
		{
		case 1:
			enqueu();
			break;
		case 2:
			dequeue();
			break;
		case 3:
			print();
			break;
		}	
	}while(ch!=0);

}

*/