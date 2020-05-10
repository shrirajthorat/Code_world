#include <stdio.h>

int main()
{
	int a[10];
	int no,i,n=5,j;
	printf("enter 10 elelments");
	for( i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	printf("enter the no. to be deleted");
	scanf("%d",&no);	
	
	for( i=0;i<n;i++)
	{
		if(a[i]==no)
		{
			for(j=i;j<n-1;j++)
			{
				a[j]=a[j+1];
				
			}
			--n;
			--i;
		}
	}
		for( i=0;i<n;i++)
	{
		printf("\n%d",a[i]);
	}
	
}
