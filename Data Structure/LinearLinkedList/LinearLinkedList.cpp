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
	friend class list;
};

class list{
	node* head,*trav,*temp;
public:
	list()
	{
		head=NULL;
		trav=NULL;
		temp=NULL;
	}
	void addFirst(int e);
	void addLast(int e);
	void addAtposition(int e,int pos);
	void deleteFirst();
	void deleteAtposition(int pos);
	void deletebyKey(int e);
	void deleteAll();
	void traverseList();
};
void list::addFirst(int e)
{
	 node* n=new node(e);
	 if(head==NULL)
	 {
		head=n;
	 }else
	 {
		 n->next=head;
		 head=n;
	 }
}
void list::addLast(int e)
{
	node* n=new node(e);
	 if(head==NULL)
	 {
		head=n;
	 }else
	 {
		 trav=head;
		 while(trav->next!=NULL)
			 trav=trav->next;
		 trav->next=n;
	 }
}
void list::addAtposition(int e,int pos)
{
	if(head==NULL || pos==1)
	 {
		 addFirst(e);
	 }else{
		 node* n=new node(e);
		 trav=head;
		for(int i=1;i<pos-1;i++){
			 trav=trav->next;
		}
		 n->next=trav->next;
		 trav->next=n;
	}
}
void list::deleteFirst()
{
	trav=head;
	head=head->next;
	delete trav;
}
void list::deleteAtposition(int pos)
{
	if(head==NULL || pos==1)
	 {
		 deleteFirst();
	 }else{
		 trav=head;
		for(int i=1;i<pos-1;i++)
			 trav=trav->next;

		temp=trav->next;
		trav->next=temp->next;
		delete temp;
	}
}
void list::deletebyKey(int e)
{
	if(head==NULL)
		cout<<"List is empty";
	else{	
			trav=head;
			while(trav->next->data!=e){
				 trav=trav->next;
			}
		temp=trav->next;
		trav->next=temp->next;
		delete temp;
	}
}
void list::deleteAll()
{
	while(head!=NULL)
		deleteFirst();
}
void list::traverseList()
{
	trav=head;
	while(trav!=NULL)
	{
		cout<<trav->data<<" ";
		trav=trav->next;
	}

}

int main(){
	int ch,e,pos;
	list l;
	do{
		cout<<"\n1)addFirst \n2)addLast \n3)addAtposition \n4)deleteFirst \n5)deleteAtPosition \n6)deletebyKey \n7)deleteAll \n8)traverseList \n9)Exit 0		";
		cin>>ch;
		switch(ch){
		    case 1:
				cout<<"\ninsert element";
				cin>>e;
				l.addFirst(e);
				break;
			case 2:
				cout<<"\ninsert element";
				cin>>e;
				l.addLast(e);
				break;
			case 3:
				cout<<"\ninsert element and pos";
				cin>>e>>pos;
				l.addAtposition(e,pos);
				break;
			case 4:
				cout<<"\nDelete First element";
				l.deleteFirst();
				break;
			case 5:
				cout<<"\n delete at pos";
				cin>>pos;
				l.deleteAtposition(pos);
				break;
			case 6:
				cout<<"\n Enter element to delete";
				cin>>e;
				l.deletebyKey(e);
				break;
			case 7:
				l.deleteAll();
				break;
			case 8:
				l.traverseList();
				break;
		}
	}while(ch!=0);
}
*/
