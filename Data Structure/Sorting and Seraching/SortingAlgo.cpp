#include<iostream>
using namespace std;

int a[]={10,50,30,70,20,60,100,5};
int size=8,t;

/*
void bubbleSort()			//Bubble sort....biggest at the end
{
	for(int i=0;i<size-1;i++)
	{
		for(int j=0;j<size-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	for(int i=0;i<size;i++)
	{
		cout<<a[i]<<" ";
	}
}*/
/*
void selectionSort()			//Selection Sort...Lowest at d begining
{
	for(int i=0;i<size-1;i++)
	{
		for(int j=i+1;j<size;j++)
		{
			if(a[i]>a[j])
			{
				swap(a[i],a[j]);
			}
		}
	}
}*/

/*void insertionSort()				// Insertion sort(Right Shift)
{
	for(int i=0;i<size-1;i++)
	{
		int j=i+1;
		t=a[j];
		while(j>0 && a[j-1]>t)
		{
				a[j]=a[j-1];
				j--;
		}
		a[j]=t;
	}
}*/
int temp[100];
int k=0;
/*void merger(int l,int m,int r);
void mergeSort(int l,int r)			//merge sort
{
	int m;
	if(l<r)
	{
		m=(l+r)/2;
		mergeSort(l,m);
		mergeSort(m+1,r);
		merger(l,m,r);
	}
}
void merger(int l,int m,int r)
{
	int i=l;
	k=l;
	int j=m+1;
	while(i<=m && j<=r)
	{
		if(a[i]<a[j])
			temp[k++]=a[i++];
		else
			temp[k++]=a[j++];
	}
	while(i<=m)
		temp[k++]=a[i++];
	while(j<=r)
		temp[k++]=a[j++];
	for(k=l;k<=r;k++)
		a[k]=temp[k];
}*/

void quickSort(int l,int r)
{
	int i,j,pivot;
	 i=l;
	 j=r;
	pivot=l;
	while(i<j)
	{
		while(a[i]<a[pivot])
		{
			i++;
		}
		
		while(a[j]>a[pivot])
		{
			j--;
		}

		if(i<j)
		{
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}

	}
	if(i<r){
		quickSort(i+1,r);
	}
	if(l<j){
		quickSort(l,j-1);
	}

}


int main()
{
	//bubbleSort();
	//selectionSort();
	//insertionSort();
	//mergeSort(0,7);
	quickSort(0,7);
	 
	for(int i=0;i<size;i++)
	{
		cout<<a[i]<<" ";
	}
	
}
