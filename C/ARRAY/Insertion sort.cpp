#include<stdio.h>

int main()
{
	int a[5];
	int i,j,n=5,k,temp;
	printf("enter 5 elelments\n");
	for( i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=1;i<5;i++)
	{
		for(j=0;j<i;j++)
		{
			if(a[j]>a[i])
			{
				temp=a[j];
				a[j]=a[i];
			}
			for(k=i;k>j;k--)
			{
				a[k]=a[k-1];
			}
			a[k+1]=temp;
		}
	}
	for( i=0;i<5;i++)
	{
		printf("\n%d",a[i]);
	}
	
	
}
