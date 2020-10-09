/*
#include<iostream>

using namespace std;

int s[100],maxSize,front,rear;

void queueInit(int size)
{
	maxSize=size;
	front=0;
	rear=-1;
}
bool isFull()
{
	if((maxSize-1)==rear)
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
	{		
		int e;
		cout<<"\n Enter an element ";
		cin>>e;
		rear++;
		s[rear]=e;
	}
}
bool isEmpty()
{
	if(front>rear)
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
		cout<<s[front];
		front++;
	}
}
 void print()
 {
	 if(isEmpty())
	{
		cout<<"\n Queue is empty ";
	}else
	{
			for(int i=front;i<=rear;i++)
		 {
			 cout<<" "<<s[i];
		 }
	}
	 

 }


int main()
{
	int size,ch;
	std::cout<<"Enter size of the queue ";
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
