#include<iostream>
using namespace std;
class node{	
public:
	node *right,*left,*root,*t,*last,*n;
	int data;
	node(){
		root=NULL;
	}
	node(int e)
	{
		t=NULL;
		right=NULL;
		left=NULL;
		data=e;
		root=NULL;
	}
	void insertLeft(int e);
	void deleteLeft();
	void insertRight(int e);
	void deleteRight();
	void print();
};

void node::insertLeft(int e)
{
	 n=new node(e);
	if(root==NULL){
		root=n;
	}
	else{
		n->right=root;
 		root->left=n;
		root=n;
	}
}
void node::deleteLeft()
{
	if(root==NULL)
		cout<<"List is empty";
	else if(root->left==NULL && root->right==NULL)
			root=NULL;
	else{
		t=root;
		root=root->right;
		t->right=NULL;
		root->left=NULL;
		
		cout<<t->data;
		delete t;

	}
}
void node::insertRight(int e)
{
	n=new node(e);
	if(root==NULL){
		root=n;
	}
	else{
		t=root;
		while(t->right!=NULL)
		{
			t=t->right;
		}
		t->right=n;
		n->left=t;
		n->right=NULL;
	}
}
void node::deleteRight()
{
	if(root==NULL)
		cout<<"List is empty";
	else if(root->left==NULL && root->right==NULL)
			root=NULL;
	else{
		t=root;
		while(t->right!=NULL)
			t=t->right;
		last=t->left;
		last->right=NULL;
		cout<<t->data<<" ";
		delete t;
	}
}
void node::print()
{
	t=root;
	if(root==NULL)
		cout<<"List is empty";
	else{
	while(t->right!=NULL)
	{
		t=t->right;
	}
	while(t!=NULL)
	{
		cout<<t->data<<" ";
		t=t->left;
	}
	}
}

int main()
{
	int ch,e;
	node n;
	do{	
		cout<<"\n1)insertLeft \n2)deleteLeft \n3)insertRight \n4)deleteRight \n5)Print From back \n0)Exit	";
		cin>>ch;
	switch(ch)
	{
	case 1:
		cout<<"insert element to insertLeft ";
		cin>>e;
		n.insertLeft(e);
		break;
	case 2:
		n.deleteLeft();
		break;
	case 3:
		cout<<"insert element to insertRight ";
		cin>>e;
		n.insertRight(e);
		break;
	case 4:
		n.deleteRight();
		break;
	case 5:
		n.print();
		break;
	case 6:
		exit(0);
	}
	}while(ch!=0);
}
