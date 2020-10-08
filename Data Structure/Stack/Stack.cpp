/*
#include <iostream>

using namespace std;

int s[10],tos,MaxSize;

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
void push()
{
    if(isFull())
    {
        cout<<"Stack is full";
    }else
    {
        int temp;
        cout<<"enter element to insert ";
        cin>>temp;
        tos++;
        s[tos]=temp;
		
        cout<<"Item inserted succesfully ";
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
		cout<<"Stack is empty ";
	}else
	{
		cout<<s[tos]<<" ";
		tos--;
	}
}

void peek()
{
	cout<<s[tos]<<" ";
}
void print()
{
	for(int i=tos;i>=0;i--)
	{
		cout<<s[i]<<" ";
	}
}
int main()
{
    int size,choice;
    cout<<"Enter size of stack ";
    cin>>size;
    init(size);
    
    do{
        cout<<"\n 1.Push : \n 2.Pop : \n 3.Peek \n 4.Print : \n 0.Exit \n:";
        cin>>choice;
        
        switch(choice){
        case 1:
                push();
                break;
		case 2:
				pop();
				break;
		case 3:
				peek();
				break;
		case 4:
				print();
				break;
		case 0:
				exit(0);
		}
    }while(choice!=0);

	getc;
    return 0;
}
*/